#import <UIKit/UIKit.h>
#import "RCTBridgeModule.h"

@interface RNPhoneCall : NSObject <RCTBridgeModule>
@end

@implementation RNPhoneCall

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(phoneCall:(NSString *)number)
{
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:[NSString stringWithFormat:@"telprompt:%@", number]]];
};

@end
