package com.obladorfork.keychain;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class KeychainPackageNew implements ReactPackage {

  private final KeychainModuleBuilderNew builder;

  public KeychainPackageNew() {
    this(new KeychainModuleBuilderNew());
  }

  public KeychainPackageNew(KeychainModuleBuilderNew builder) {
    this.builder = builder;
  }

  @Override
  @NonNull
  public List<NativeModule> createNativeModules(@NonNull final ReactApplicationContext reactContext) {
    return Collections.singletonList(builder.withReactContext(reactContext).build());
  }

  @NonNull
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  @NonNull
  public List<ViewManager> createViewManagers(@NonNull final ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
