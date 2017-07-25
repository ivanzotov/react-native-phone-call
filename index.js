import { NativeModules } from 'react-native'

var RNPhoneCall = {
  phoneCall: function(number) {
    NativeModules.RNPhoneCall.phoneCall(number)
  }
};

export default RNPhoneCall
