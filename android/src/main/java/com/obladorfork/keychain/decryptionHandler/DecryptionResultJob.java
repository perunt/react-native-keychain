package com.obladorfork.keychain.decryptionHandler;

import android.security.keystore.UserNotAuthenticatedException;

import com.obladorfork.keychain.cipherStorage.CipherStorage;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface DecryptionResultJob {
    CipherStorage.DecryptionResult get() throws UserNotAuthenticatedException, IOException, GeneralSecurityException;
}
