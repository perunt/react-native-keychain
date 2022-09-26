const path = require('path');

module.exports = {
  dependency: {
    platforms: {
      ios: { podspecPath: path.join(__dirname, 'RNKeychain.podspec') },
      android: {
        packageImportPath:
          'import com.obladorfork.keychain.KeychainPackageNew;',
        packageInstance: 'new KeychainPackageNew()',
      },
    },
  },
};
