/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.test.services.events.discovery;

import android.os.Parcel;
import android.os.Parcelable;

/** Base class for different test discovery events to implement. */
public class TestDiscoveryEvent implements Parcelable {

  TestDiscoveryEvent(Parcel source) {}

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel parcel, int i) {}

  public static final Parcelable.Creator<TestDiscoveryEvent> CREATOR =
      new Parcelable.Creator<TestDiscoveryEvent>() {
        @Override
        public TestDiscoveryEvent createFromParcel(Parcel source) {
          return new TestDiscoveryEvent(source);
        }

        @Override
        public TestDiscoveryEvent[] newArray(int size) {
          return new TestDiscoveryEvent[size];
        }
      };
}
