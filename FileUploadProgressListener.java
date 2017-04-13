/*
 * Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package sample;

import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.googleapis.media.MediaHttpUploaderProgressListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import java.io.IOException;
import java.text.NumberFormat;

/**
 * The File Upload Progress Listener.
 *
 * @author rmistry@google.com (Ravi)
 */
public class FileUploadProgressListener implements MediaHttpUploaderProgressListener {
public static String status;
  @Override
  public void progressChanged(MediaHttpUploader uploader) throws IOException {

    switch (uploader.getUploadState()) {
      case INITIATION_STARTED:
        View.header1("Upload Initiation has started...");
        status = "Upload Initiation has started...";

          break;
      case INITIATION_COMPLETE:
        View.header1("Upload Initiation is Complete...");
          status = "Upload BOOOOM";
          //downloadstatus.setText("Upload Initiation is Complete...");
          break;
      case MEDIA_IN_PROGRESS:
        View.header1("Upload is In Progress ... : " + NumberFormat.getPercentInstance().format(uploader.getProgress()).toString());
          //downloadstatus.setText("Upload is In Progress ... : ");
          break;
      case MEDIA_COMPLETE:
        View.header1("Upload is Complete!");
          //downloadstatus.setText("Upload is Complete!");
          break;
    }
  }
}
