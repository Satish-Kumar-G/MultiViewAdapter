/*
 * Copyright 2017 Riyaz Ahamed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gradle;

public interface Config {

  int MIN_SDK = 14;
  int COMPILE_SDK = 28;
  int TARGET_SDK = COMPILE_SDK;

  String VERSION = "3.0.0";
  String APP_VERSION = VERSION + ".2";
  String PRODUCTION_VERSION = VERSION + "-beta01";
  String SNAPSHOT_VERSION = VERSION + "-SNAPSHOT";
  int VERSION_CODE = 210200003;

  String APP_COMPAT = "androidx.appcompat:appcompat:1.0.2";
  String DESIGN = "com.google.android.material:material:1.1.0-alpha06";
  String RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.0.0";
  String CARD_VIEW = "androidx.cardview:cardview:1.0.0";
  String SUPPORT_ANNOTATION = "androidx.annotations:annotations:1.0.2";

  String RX_JAVA = "io.reactivex.rxjava2:rxjava:2.2.4";
  String RX_ANDROID = "io.reactivex.rxjava2:rxandroid:2.1.0";

  String USER_ORG = "devahamed";
  String GROUP_ID = "dev.ahamed.mva3";
  String REPO_NAME = "MVA3";
  String DESC = "Easily create complex recyclerview adapters in android";
  String WEBSITE = "https://github.com/DevAhamed/MultiViewAdapter";

  String ARTIFACT_ID_CORE = "adapter";
  String ARTIFACT_ID_DATA_BINDING = "ext-databinding";
  String ARTIFACT_ID_DECORATOR = "ext-decorator";
  String ARTIFACT_ID_DIFFUTIL_RX = "ext-diffutil-rx";
}
