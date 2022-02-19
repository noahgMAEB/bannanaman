package com.smoothies;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "smoothies";
  }
}

 private BroadcastReceiver myBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle b = intent.getExtras();

        if (action.equals(getResources().getString(R.string.activity_intent_filter_action))) {
            //  Received a barcode scan
            try {
                displayScanResult(intent, "via Broadcast");
            } catch (Exception e) {
                //  Catch if the UI does not exist when we receive the broadcast
            }
        }
    }