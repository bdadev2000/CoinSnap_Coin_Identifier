package L4;

import C2.m;
import G7.j;
import R3.k;
import U4.p;
import W1.F;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.facebook.C1849l;
import com.facebook.H;
import com.facebook.internal.C1843l;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.internal.z;
import com.facebook.r;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import k2.InterfaceC2429a;
import o4.InterfaceC2498d;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class f implements A5.d, G5.c, h3.e, N1.g, InterfaceC2429a, RewardItem, F, k2.c, K4.a, InterfaceC2498d, OnSessionTrackingSucceededListener {
    public final /* synthetic */ int b;

    public /* synthetic */ f(int i9) {
        this.b = i9;
    }

    public static final String b(String str) {
        HashSet hashSet = com.facebook.appevents.e.f13477h;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            Charset forName = Charset.forName("UTF-8");
            j.d(forName, "Charset.forName(charsetName)");
            if (str != null) {
                byte[] bytes = str.getBytes(forName);
                j.d(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                j.d(digest, "digest.digest()");
                return E2.e.a(digest);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (UnsupportedEncodingException unused) {
            r rVar = r.f13801a;
            return "1";
        } catch (NoSuchAlgorithmException unused2) {
            r rVar2 = r.f13801a;
            return "0";
        }
    }

    public static final void c(String str) {
        boolean contains;
        HashSet hashSet = com.facebook.appevents.e.f13477h;
        if (str != null && str.length() != 0 && str.length() <= 40) {
            HashSet hashSet2 = com.facebook.appevents.e.f13477h;
            synchronized (hashSet2) {
                contains = hashSet2.contains(str);
            }
            if (!contains) {
                Pattern compile = Pattern.compile("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$");
                j.d(compile, "compile(...)");
                if (compile.matcher(str).matches()) {
                    synchronized (hashSet2) {
                        hashSet2.add(str);
                    }
                    return;
                }
                throw new C1849l(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
            }
            return;
        }
        if (str == null) {
            str = "<None Provided>";
        }
        throw new C1849l(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
    }

    public static f d(Context context, int i9) {
        boolean z8;
        if (i9 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        m.e("Cannot create a CalendarItemStyle with a styleResId of 0", z8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, AbstractC2861a.m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList p2 = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 4);
        ColorStateList p7 = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 9);
        ColorStateList p9 = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k a6 = k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new R3.a(0)).a();
        obtainStyledAttributes.recycle();
        return new f(p2, p7, p9, dimensionPixelSize, a6, rect);
    }

    public static String g(StringBuilder sb) {
        char c9;
        char c10;
        int length = sb.length();
        if (length != 0) {
            char c11 = 0;
            char charAt = sb.charAt(0);
            if (length >= 2) {
                c9 = sb.charAt(1);
            } else {
                c9 = 0;
            }
            if (length >= 3) {
                c10 = sb.charAt(2);
            } else {
                c10 = 0;
            }
            if (length >= 4) {
                c11 = sb.charAt(3);
            }
            int i9 = (charAt << 18) + (c9 << '\f') + (c10 << 6) + c11;
            char c12 = (char) ((i9 >> 16) & 255);
            char c13 = (char) ((i9 >> 8) & 255);
            char c14 = (char) (i9 & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append(c12);
            if (length >= 2) {
                sb2.append(c13);
            }
            if (length >= 3) {
                sb2.append(c14);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static void l(H h6, String str, String str2) {
        j.e(str, "tag");
        j.e(str2, "string");
        o(h6, str, str2);
    }

    public static void o(H h6, String str, String str2) {
        j.e(h6, "behavior");
        j.e(str, "tag");
        j.e(str2, "string");
        r.h(h6);
    }

    @Override // h3.e, t.InterfaceC2702a
    public Object apply(Object obj) {
        return ((zzhe) obj).zzc();
    }

    @Override // k2.InterfaceC2429a
    public Object e() {
        try {
            return new R1.g(MessageDigest.getInstance(Constants.SHA256));
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // o4.InterfaceC2498d
    public Object f(p pVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(pVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "";
    }

    @Override // W1.F
    public void h(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r9 <= 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0053, code lost:
    
        r8.k.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0056, code lost:
    
        throw null;
     */
    @Override // G5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(G5.d r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.f.j(G5.d):void");
    }

    public synchronized C1843l k() {
        w wVar = w.f13674a;
        t b = w.b(r.b());
        if (b == null) {
            return C1843l.f13617d.r();
        }
        return b.f13661e;
    }

    @Override // W1.F
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0421 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v13, types: [A5.d] */
    /* JADX WARN: Type inference failed for: r3v36, types: [G5.c] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v10, types: [G5.c[]] */
    @Override // A5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D5.b n(java.lang.String r21, int r22, java.util.EnumMap r23) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.f.n(java.lang.String, int, java.util.EnumMap):D5.b");
    }

    @Override // com.adjust.sdk.OnSessionTrackingSucceededListener
    public void onFinishedSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
        Log.d("MiaAdjust", "Session success callback called!");
        Log.d("MiaAdjust", "Session success data: " + adjustSessionSuccess.toString());
    }

    public synchronized void p(String str) {
        j.e(str, "accessToken");
        r rVar = r.f13801a;
        r.h(H.f13411c);
        synchronized (this) {
            z.f13681d.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    public f(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i9, k kVar, Rect rect) {
        this.b = 23;
        m.f(rect.left);
        m.f(rect.top);
        m.f(rect.right);
        m.f(rect.bottom);
    }

    @Override // k2.c
    public void i(Object obj) {
    }

    @Override // N1.g
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
