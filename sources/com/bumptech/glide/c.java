package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.a4;
import androidx.appcompat.widget.c4;
import androidx.appcompat.widget.s2;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.facebook.d0;
import com.facebook.g0;
import com.facebook.internal.r0;
import com.facebook.l0;
import com.facebook.q;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.UserMessagingPlatform;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ic.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import n9.x;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import s7.x1;

/* loaded from: classes.dex */
public abstract class c {
    public static ConsentInformation a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f9613b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f9614c = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9615d = {44100, 48000, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9616e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9617f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9618g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f9619h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f9620i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: j, reason: collision with root package name */
    public static Class f9621j;

    public static Intent A(Context context, ComponentName componentName) {
        String B = B(context, componentName);
        if (B == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), B);
        if (B(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String B(Context context, ComponentName componentName) {
        int i10;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i10 = 269222528;
        } else {
            i10 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static String C(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static File D(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean E(int i10, String str) {
        return str != null && str.length() >= i10 && str.charAt(i10 - 1) == '1';
    }

    public static boolean F(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int G(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 != 32) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            if (i10 == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(eb.j.i("type needs to be >= FIRST and <= LAST, type=", i10));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static void H(ag.b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        a = UserMessagingPlatform.getConsentInformation(callback.b());
        ConsentRequestParameters build = new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false).build();
        ConsentInformation consentInformation = a;
        if (consentInformation != null) {
            consentInformation.requestConsentInfoUpdate(callback.b(), build, new p(callback), new de.b(callback));
        }
    }

    public static MappedByteBuffer I(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R, null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final g0 J(com.facebook.a aVar, Uri imageUri, r0 r0Var) {
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        equals = StringsKt__StringsJVMKt.equals("file", imageUri.getScheme(), true);
        l0 l0Var = l0.POST;
        if (equals && path != null) {
            d0 d0Var = new d0(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", d0Var);
            return new g0(aVar, "me/staging_resources", bundle, l0Var, r0Var);
        }
        equals2 = StringsKt__StringsJVMKt.equals(AppLovinEventTypes.USER_VIEWED_CONTENT, imageUri.getScheme(), true);
        if (equals2) {
            d0 d0Var2 = new d0(imageUri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", d0Var2);
            return new g0(aVar, "me/staging_resources", bundle2, l0Var, r0Var);
        }
        throw new q("The image Uri must be either a file:// or content:// Uri");
    }

    public static TypedArray K(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void L(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static int M(int i10) {
        int i11;
        int i12;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        if (i12 == 1) {
            return i11 == 3 ? 1152 : 576;
        }
        if (i12 == 2) {
            return 1152;
        }
        if (i12 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static f0.c N(byte[] bArr) {
        x xVar = new x(bArr);
        if (xVar.f22600c < 32) {
            return null;
        }
        xVar.G(0);
        if (xVar.f() != (xVar.f22600c - xVar.f22599b) + 4 || xVar.f() != 1886614376) {
            return null;
        }
        int f10 = (xVar.f() >> 24) & 255;
        if (f10 > 1) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Unsupported pssh version: ", f10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(xVar.o(), xVar.o());
        if (f10 == 1) {
            xVar.H(xVar.y() * 16);
        }
        int y4 = xVar.y();
        if (y4 != xVar.f22600c - xVar.f22599b) {
            return null;
        }
        ?? r22 = new byte[y4];
        xVar.d(r22, 0, y4);
        return new f0.c(uuid, f10, (Serializable) r22);
    }

    public static byte[] O(byte[] bArr, UUID uuid) {
        f0.c N = N(bArr);
        if (N == null) {
            return null;
        }
        if (!uuid.equals((UUID) N.f17516c)) {
            n9.o.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + ((UUID) N.f17516c) + ".");
            return null;
        }
        return (byte[]) N.f17517d;
    }

    public static void P(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    public static int Q(int i10, x xVar) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return xVar.v() + 1;
            case 7:
                return xVar.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r2.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004d, code lost:
    
        if (r3 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String R(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            r7 = 1
            if (r6 == r7) goto L40
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r8 <= r5) goto L40
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L40:
            if (r3 == 0) goto L50
        L42:
            r3.close()     // Catch: java.io.IOException -> L50
            goto L50
        L46:
            r9 = move-exception
            goto L64
        L48:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L50
            goto L42
        L50:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L60
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L63
        L60:
            r9.deleteFile(r0)
        L63:
            return r2
        L64:
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.io.IOException -> L69
        L69:
            throw r9
        L6a:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.R(android.content.Context):java.lang.String");
    }

    public static final void S(String str, String str2) {
        try {
            if (f9621j == null) {
                Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
                Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
                f9621j = cls;
            }
            Class cls2 = f9621j;
            if (cls2 != null) {
                Method method = cls2.getMethod("UnitySendMessage", String.class, String.class, String.class);
                Class cls3 = f9621j;
                if (cls3 != null) {
                    method.invoke(cls3, "UnityFacebookSDKPlugin", str, str2);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                    throw null;
                }
            }
            Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
            throw null;
        } catch (Exception e2) {
            Log.e("com.bumptech.glide.c", "Failed to send message to Unity", e2);
        }
    }

    public static void T(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a4.a(view, charSequence);
            return;
        }
        c4 c4Var = c4.f828m;
        if (c4Var != null && c4Var.f830b == view) {
            c4.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            c4 c4Var2 = c4.f829n;
            if (c4Var2 != null && c4Var2.f830b == view) {
                c4Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new c4(view, charSequence);
    }

    public static void U(PAGRequest pAGRequest, String str, MediationAdConfiguration mediationAdConfiguration) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String watermark = mediationAdConfiguration.getWatermark();
        if (TextUtils.isEmpty(watermark)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put("admob_watermark", watermark);
        pAGRequest.setExtraInfo(extraInfo);
    }

    public static j8.e V(int i10, y7.m mVar, x xVar) {
        j8.e a10 = j8.e.a(mVar, xVar);
        while (a10.a != i10) {
            StringBuilder sb2 = new StringBuilder("Ignoring unknown WAV chunk: ");
            int i11 = a10.a;
            sb2.append(i11);
            n9.o.f("WavHeaderReader", sb2.toString());
            long j3 = a10.f19811b + 8;
            if (j3 <= 2147483647L) {
                mVar.skipFully((int) j3);
                a10 = j8.e.a(mVar, xVar);
            } else {
                throw x1.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
        }
        return a10;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0271, code lost:
    
        if (r2.f26574d == r8) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (r4.f26574d == r13) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0709 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0577 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(w.f r36, t.d r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.b(w.f, t.d, java.util.ArrayList, int):void");
    }

    public static final OutcomeReceiver c(CancellableContinuationImpl cancellableContinuationImpl) {
        return new j0.g(cancellableContinuationImpl);
    }

    public static void d(int i10, int i11) {
        GLES20.glBindTexture(i10, i11);
        j();
        GLES20.glTexParameteri(i10, 10240, 9729);
        j();
        GLES20.glTexParameteri(i10, 10241, 9729);
        j();
        GLES20.glTexParameteri(i10, 10242, 33071);
        j();
        GLES20.glTexParameteri(i10, 10243, 33071);
        j();
    }

    public static ArrayList e(byte[] bArr) {
        long j3 = ((((bArr[11] & UByte.MAX_VALUE) << 8) | (bArr[10] & UByte.MAX_VALUE)) * C.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j3).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static byte[] f(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i10;
        int i11;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        int i12 = i10 + 32;
        if (uuidArr != null) {
            i12 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12);
        allocate.putInt(i12);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i11 = 16777216;
        } else {
            i11 = 0;
        }
        allocate.putInt(i11);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (r7 == r18.f27998f) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        if ((r17.v() * 1000) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        if (r4 == r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(n9.x r17, y7.s r18, int r19, y7.p r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.g(n9.x, y7.s, int, y7.p):boolean");
    }

    public static void h(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean i(y7.m mVar) {
        x xVar = new x(8);
        int i10 = j8.e.a(mVar, xVar).a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        mVar.peekFully(xVar.a, 0, 4);
        xVar.G(0);
        int f10 = xVar.f();
        if (f10 != 1463899717) {
            n9.o.c("WavHeaderReader", "Unsupported form type: " + f10);
            return false;
        }
        return true;
    }

    public static void j() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (!z10) {
        } else {
            throw new n9.i(sb2.toString());
        }
    }

    public static void k(String str, boolean z10) {
        if (!z10) {
            throw new n9.i(str);
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean n(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean o10 = o(inputStream, file);
            m(inputStream);
            return o10;
        } catch (Throwable th3) {
            th = th3;
            m(inputStream);
            throw th;
        }
    }

    public static boolean o(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            m(fileOutputStream);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    m(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public static FloatBuffer p(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void q(String str, String str2, Object obj) {
        String C = C(str);
        if (Log.isLoggable(C, 3)) {
            Log.d(C, String.format(str2, obj));
        }
    }

    public static void r(String str, String str2, Exception exc) {
        String C = C(str);
        if (Log.isLoggable(C, 6)) {
            Log.e(C, str2, exc);
        }
    }

    public static androidx.core.app.x1[] s(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        androidx.core.app.x1[] x1VarArr = new androidx.core.app.x1[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            Bundle bundle = bundleArr[i10];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            x1VarArr[i10] = new androidx.core.app.x1(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return x1VarArr;
    }

    public static Drawable t(Context context, int i10) {
        return s2.c().e(context, i10);
    }

    public static int u(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f9615d[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f9616e[i13 - 1];
            } else {
                i16 = f9617f[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f9618g[i13 - 1];
            } else {
                i15 = f9619h[i13 - 1];
            }
        } else {
            i15 = f9620i[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return a4.j.z(i15, 144, i17, i18);
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return a4.j.z(i19, i15, i17, i18);
    }

    public static f0.c v(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        f0.c cVar;
        boolean F = F(xmlPullParser, str);
        Object obj = null;
        int i11 = 0;
        if (F) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new f0.c(typedValue.data, obj, obj);
            }
            try {
                cVar = f0.c.c(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new f0.c(i11, obj, obj);
    }

    public static float w(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        if (!F(xmlPullParser, str)) {
            return f10;
        }
        return typedArray.getFloat(i10, f10);
    }

    public static int x(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!F(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getInt(i10, i11);
    }

    public static long y(byte b3, byte b10) {
        int i10;
        int i11 = b3 & UByte.MAX_VALUE;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b10 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r0 : i13 >= 12 ? 10000 << (r0 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static Intent z(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String B = B(activity, activity.getComponentName());
            if (B == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, B);
            try {
                if (B(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + B + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
