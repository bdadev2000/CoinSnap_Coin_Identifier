package com.facebook.appevents;

import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends ObjectInputStream {
    public f(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
        if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            resultClassDescriptor = ObjectStreamClass.lookup(a.class);
        } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            resultClassDescriptor = ObjectStreamClass.lookup(d.class);
        }
        Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
        return resultClassDescriptor;
    }
}
