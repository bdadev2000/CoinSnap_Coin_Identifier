package com.facebook.appevents.ml;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import b1.f0;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.a;
import z0.m;

@RestrictTo
/* loaded from: classes4.dex */
public final class Utils {

    @NotNull
    private static final String DIR_NAME = "facebook_ml/";

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    @Nullable
    public static final File getMlDir() {
        if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
            return null;
        }
        try {
            File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), DIR_NAME);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utils.class);
            return null;
        }
    }

    @Nullable
    public static final Map<String, MTensor> parseModelWeights(@NotNull File file) {
        int i2;
        if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
            return null;
        }
        try {
            a.s(file, ShareInternalUtility.STAGING_PARAM);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i3 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i4 = wrap.getInt();
                int i5 = i4 + 4;
                if (available < i5) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i4, z0.a.f31458a));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i6 = length - 1;
                if (i6 >= 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        strArr[i7] = names.getString(i7);
                        if (i8 > i6) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                int i9 = 1;
                if (length > 1) {
                    Arrays.sort(strArr);
                }
                HashMap hashMap = new HashMap();
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i11 = length2 - 1;
                        if (i11 >= 0) {
                            int i12 = i9;
                            int i13 = i3;
                            while (true) {
                                int i14 = i13 + 1;
                                int i15 = jSONArray.getInt(i13);
                                iArr[i13] = i15;
                                i12 *= i15;
                                if (i14 > i11) {
                                    break;
                                }
                                i13 = i14;
                            }
                            i2 = i12;
                        } else {
                            i2 = 1;
                        }
                        int i16 = i2 * 4;
                        int i17 = i5 + i16;
                        if (i17 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i5, i16);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        MTensor mTensor = new MTensor(iArr);
                        wrap2.asFloatBuffer().get(mTensor.getData(), 0, i2);
                        hashMap.put(str, mTensor);
                        i5 = i17;
                        i3 = 0;
                        i9 = 1;
                    }
                }
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utils.class);
            return null;
        }
    }

    @NotNull
    public final String normalizeString(@NotNull String str) {
        List list;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            a.s(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = a.E(str.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            String obj = str.subSequence(i2, length + 1).toString();
            Pattern compile = Pattern.compile("\\s+");
            a.r(compile, "compile(...)");
            a.s(obj, "input");
            m.l1(0);
            Matcher matcher = compile.matcher(obj);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int i3 = 0;
                do {
                    arrayList.add(obj.subSequence(i3, matcher.start()).toString());
                    i3 = matcher.end();
                } while (matcher.find());
                arrayList.add(obj.subSequence(i3, obj.length()).toString());
                list = arrayList;
            } else {
                list = f0.u(obj.toString());
            }
            Object[] array = list.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String join = TextUtils.join(" ", (String[]) array);
            a.r(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @NotNull
    public final int[] vectorize(@NotNull String str, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            a.s(str, "texts");
            int[] iArr = new int[i2];
            String normalizeString = normalizeString(str);
            Charset forName = Charset.forName("UTF-8");
            a.r(forName, "forName(\"UTF-8\")");
            if (normalizeString == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = normalizeString.getBytes(forName);
            a.r(bytes, "(this as java.lang.String).getBytes(charset)");
            if (i2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i3 < bytes.length) {
                        iArr[i3] = bytes[i3] & UnsignedBytes.MAX_VALUE;
                    } else {
                        iArr[i3] = 0;
                    }
                    if (i4 >= i2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return iArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
