#ifndef _include_jni__
#define _include_jni__

#include "CardApplet.h"

extern CardLibrary* buildJNI();
extern void JCFDriver__registerApplet(void);
extern void JCFDriver__methodMissing(void);

#endif
