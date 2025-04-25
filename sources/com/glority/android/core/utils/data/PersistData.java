package com.glority.android.core.utils.data;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.android.core.utils.device.DeviceIdFactory;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.UtilsApp;
import com.glority.utils.stability.LogUtils;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u001e\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0013\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0002\u0010\u001aJ$\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u0002H\u0019H\u0086\u0002¢\u0006\u0002\u0010\u001cJ'\u0010\u001d\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u0001H\u0019¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0007J\u001b\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006%"}, d2 = {"Lcom/glority/android/core/utils/data/PersistData;", "", "()V", "hexArray", "", "sharedMap", "", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "bytesToHex", "bytes", "", "contains", "", "key", "convertFromString", "text", "convertToString", "obj", LogEvents.exportemptyalert_close_click_type_get, ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/String;)Ljava/lang/Object;", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getCompat", "getDeviceId", "hexStringToByteArray", "s", "remove", "", "set", "value", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PersistData {
    public static final PersistData INSTANCE = new PersistData();
    private static final char[] hexArray;
    private static final Map<String, Object> sharedMap;

    /* renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    private static final Lazy sharedPreferences;

    private PersistData() {
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        hexArray = charArray;
        sharedMap = new ConcurrentHashMap();
        sharedPreferences = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.glority.android.core.utils.data.PersistData$sharedPreferences$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return UtilsApp.getApp().getSharedPreferences(UtilsApp.getApp().getPackageName(), 0);
            }
        });
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = sharedPreferences.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-sharedPreferences>(...)");
        return (SharedPreferences) value;
    }

    public final <T> T get(String key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) get(key);
        return t == null ? defaultValue : t;
    }

    public final <T> T get(String key) {
        Object convertFromString;
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = sharedMap;
        if (!map.containsKey(key)) {
            String string = getSharedPreferences().getString(key, null);
            if (string == null || (convertFromString = convertFromString(string)) == null) {
                return null;
            }
            map.put(key, convertFromString);
        }
        return (T) map.get(key);
    }

    public final void set(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null) {
            remove(key);
            return;
        }
        sharedMap.put(key, value);
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        Intrinsics.checkNotNullExpressionValue(edit, "sharedPreferences.edit()");
        edit.putString(key, convertToString(value));
        edit.apply();
    }

    public static /* synthetic */ Object getCompat$default(PersistData persistData, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return persistData.getCompat(str, obj);
    }

    public final <T> T getCompat(String key, T defaultValue) {
        String str;
        Boolean bool;
        Float f;
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!sharedMap.containsKey(key)) {
            if (!contains(key)) {
                return defaultValue;
            }
            Long l = null;
            try {
                str = INSTANCE.getSharedPreferences().getString(key, null);
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
                str = null;
            }
            if (str != null) {
                Object convertFromString = convertFromString(str);
                if (convertFromString == null) {
                    set(key, str);
                    return (T) get(key);
                }
                sharedMap.put(key, convertFromString);
                return (T) get(key);
            }
            try {
                bool = Boolean.valueOf(INSTANCE.getSharedPreferences().getBoolean(key, false));
            } catch (Exception e2) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e2));
                }
                bool = null;
            }
            if (bool != null) {
                set(key, bool);
                return (T) get(key, defaultValue);
            }
            try {
                f = Float.valueOf(INSTANCE.getSharedPreferences().getFloat(key, 0.0f));
            } catch (Exception e3) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e3));
                }
                f = null;
            }
            if (f != null) {
                set(key, f);
                return (T) get(key, defaultValue);
            }
            try {
                num = Integer.valueOf(INSTANCE.getSharedPreferences().getInt(key, 0));
            } catch (Exception e4) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e4));
                }
                num = null;
            }
            if (num != null) {
                set(key, num);
                return (T) get(key, defaultValue);
            }
            try {
                l = Long.valueOf(INSTANCE.getSharedPreferences().getLong(key, 0L));
            } catch (Exception e5) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e5));
                }
            }
            if (l != null) {
                set(key, l);
                return (T) get(key, defaultValue);
            }
        }
        T t = (T) sharedMap.get(key);
        return t == null ? defaultValue : t;
    }

    public final boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getSharedPreferences().contains(key);
    }

    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        sharedMap.remove(key);
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        Intrinsics.checkNotNullExpressionValue(edit, "sharedPreferences.edit()");
        edit.remove(key);
        edit.apply();
    }

    public final String getDeviceId() {
        String str = (String) get(CorePersistKey.DEVICE_ID);
        if (str != null) {
            return str;
        }
        String uuid = new DeviceIdFactory(UtilsApp.getApp()).getDeviceId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "deviceIdFactory.deviceId.toString()");
        if (TextUtils.isEmpty(uuid)) {
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        }
        set(CorePersistKey.DEVICE_ID, uuid);
        return uuid;
    }

    public final String bytesToHex(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        char[] cArr = new char[bytes.length * 2];
        int length = bytes.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                byte b = bytes[i];
                int i3 = i * 2;
                char[] cArr2 = hexArray;
                cArr[i3] = cArr2[(b & 255) >>> 4];
                cArr[i3 + 1] = cArr2[b & Ascii.SI];
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return new String(cArr);
    }

    public final byte[] hexStringToByteArray(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0034: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:38:0x0034 */
    public final String convertToString(Object obj) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream3 = null;
        try {
            if (obj == null) {
                return null;
            }
            try {
                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
                objectOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (objectOutputStream3 != null) {
                    try {
                        objectOutputStream3.close();
                    } catch (IOException e2) {
                        Log.e("PersistData", "", e2);
                    }
                }
                throw th;
            }
            try {
                objectOutputStream2.writeObject(obj);
                objectOutputStream2.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
                String bytesToHex = bytesToHex(byteArray);
                try {
                    objectOutputStream2.close();
                } catch (IOException e3) {
                    Log.e("PersistData", "", e3);
                }
                return bytesToHex;
            } catch (IOException e4) {
                e = e4;
                Log.e("PersistData", "", e);
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e5) {
                        Log.e("PersistData", "", e5);
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream3 = objectOutputStream;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object convertFromString(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "PersistData"
            java.lang.String r2 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            byte[] r6 = r5.hexStringToByteArray(r6)
            r2 = 0
            com.glority.android.core.utils.data.CompatObjectInputStream r3 = new com.glority.android.core.utils.data.CompatObjectInputStream     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.io.ObjectInputStream r3 = (java.io.ObjectInputStream) r3     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r6 = r3
            com.glority.android.core.utils.data.CompatObjectInputStream r6 = (com.glority.android.core.utils.data.CompatObjectInputStream) r6     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L46
            java.lang.Object r6 = r6.readObject()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L46
            r3.close()     // Catch: java.io.IOException -> L27
            goto L2d
        L27:
            r2 = move-exception
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            android.util.Log.e(r1, r0, r2)
        L2d:
            return r6
        L2e:
            r6 = move-exception
            goto L34
        L30:
            r6 = move-exception
            goto L48
        L32:
            r6 = move-exception
            r3 = r2
        L34:
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L46
            android.util.Log.e(r1, r0, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L45
            r3.close()     // Catch: java.io.IOException -> L3f
            goto L45
        L3f:
            r6 = move-exception
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            android.util.Log.e(r1, r0, r6)
        L45:
            return r2
        L46:
            r6 = move-exception
            r2 = r3
        L48:
            if (r2 == 0) goto L54
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L54
        L4e:
            r2 = move-exception
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            android.util.Log.e(r1, r0, r2)
        L54:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.core.utils.data.PersistData.convertFromString(java.lang.String):java.lang.Object");
    }
}
