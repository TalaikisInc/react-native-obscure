package diegofhg;

import android.app.Activity;
import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class ObscureModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public ObscureModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "Obscure";
  }

  @ReactMethod
  public void activateObscure() {
    final Activity activity = getCurrentActivity();

    if (activity != null) {
      activity.runOnUiThread(new Runnable() {
        @Override
        public void run() {
          activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
        }
      });
    }
  }

    @ReactMethod
    public void deactivateObscure() {
      final Activity activity = getCurrentActivity();

      if (activity != null) {
        activity.runOnUiThread(new Runnable() {
          @Override
          public void run() {
            activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
          }
        });
      }
    }
}