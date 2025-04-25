package androidx.datastore.preferences.protobuf;

/* loaded from: classes7.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
