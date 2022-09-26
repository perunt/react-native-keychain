package com.obladorfork.keychain;

import com.facebook.react.bridge.ReactApplicationContext;

public class KeychainModuleBuilderNew {
  public static final boolean DEFAULT_USE_WARM_UP = true;

  private ReactApplicationContext reactContext;
  private boolean useWarmUp = DEFAULT_USE_WARM_UP;

  public KeychainModuleBuilderNew withReactContext(ReactApplicationContext reactContext) {
    this.reactContext = reactContext;
    return this;
  }

  public KeychainModuleBuilderNew usingWarmUp() {
    useWarmUp = true;
    return this;
  }

  public KeychainModuleBuilderNew withoutWarmUp() {
    useWarmUp = false;
    return this;
  }

  public KeychainModule build() {
    validate();
    if (useWarmUp) {
      return KeychainModule.withWarming(reactContext);
    } else {
      return new KeychainModule(reactContext);
    }
  }

  private void validate() {
    if (reactContext == null) {
      throw new Error("React Context was not provided");
    }
  }
}
