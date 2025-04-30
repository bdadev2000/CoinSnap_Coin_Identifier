package com.facebook.appevents;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* loaded from: classes.dex */
public final class f extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        if (G7.j.a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            readClassDescriptor = ObjectStreamClass.lookup(a.class);
        } else if (G7.j.a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            readClassDescriptor = ObjectStreamClass.lookup(d.class);
        }
        G7.j.d(readClassDescriptor, "resultClassDescriptor");
        return readClassDescriptor;
    }
}
