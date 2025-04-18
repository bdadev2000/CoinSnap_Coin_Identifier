package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.Utility;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AppEventDiskStore {

    @NotNull
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";

    @NotNull
    public static final AppEventDiskStore INSTANCE = new AppEventDiskStore();
    private static final String TAG = AppEventDiskStore.class.getName();

    /* loaded from: classes2.dex */
    public static final class MovedClassObjectInputStream extends ObjectInputStream {

        @NotNull
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";

        @NotNull
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }
        }

        public MovedClassObjectInputStream(@Nullable InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        @NotNull
        public ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (p0.a.g(readClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                readClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (p0.a.g(readClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                readClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            p0.a.r(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    private AppEventDiskStore() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0028, B:14:0x002b, B:17:0x009f, B:23:0x0039, B:44:0x0074, B:46:0x0077, B:47:0x0089, B:50:0x0082, B:36:0x005e, B:38:0x0061, B:41:0x006c, B:33:0x0070, B:27:0x008a, B:29:0x008d, B:32:0x0098), top: B:3:0x0003, inners: #1, #4, #5, #10 }] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.appevents.PersistedEvents readAndClearStore() {
        /*
            java.lang.Class<com.facebook.appevents.AppEventDiskStore> r0 = com.facebook.appevents.AppEventDiskStore.class
            monitor-enter(r0)
            com.facebook.appevents.internal.AppEventUtility.assertIsNotMainThread()     // Catch: java.lang.Throwable -> L35
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            p0.a.r(r3, r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            com.facebook.appevents.AppEventDiskStore$MovedClassObjectInputStream r4 = new com.facebook.appevents.AppEventDiskStore$MovedClassObjectInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            if (r3 == 0) goto L46
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            goto L40
        L35:
            r1 = move-exception
            goto La6
        L38:
            r1 = move-exception
            java.lang.String r2 = com.facebook.appevents.AppEventDiskStore.TAG     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L35
        L40:
            r2 = r3
            goto L9d
        L42:
            r2 = move-exception
            goto L74
        L44:
            r3 = move-exception
            goto L57
        L46:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            throw r3     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
        L4e:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L74
        L52:
            r3 = move-exception
            r4 = r2
            goto L57
        L55:
            r4 = r2
            goto L8a
        L57:
            java.lang.String r5 = com.facebook.appevents.AppEventDiskStore.TAG     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L42
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L6b
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L6b
            goto L9d
        L6b:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.AppEventDiskStore.TAG     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L74:
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L81
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L81
            goto L89
        L81:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.AppEventDiskStore.TAG     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L35
        L89:
            throw r2     // Catch: java.lang.Throwable -> L35
        L8a:
            com.facebook.internal.Utility.closeQuietly(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L97
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L97
            goto L9d
        L97:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.AppEventDiskStore.TAG     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        L9d:
            if (r2 != 0) goto La4
            com.facebook.appevents.PersistedEvents r2 = new com.facebook.appevents.PersistedEvents     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
        La4:
            monitor-exit(r0)
            return r2
        La6:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventDiskStore.readAndClearStore():com.facebook.appevents.PersistedEvents");
    }

    public static final void saveEventsToDisk$facebook_core_release(@Nullable PersistedEvents persistedEvents) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
            try {
                objectOutputStream2.writeObject(persistedEvents);
                Utility.closeQuietly(objectOutputStream2);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    Utility.closeQuietly(objectOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
