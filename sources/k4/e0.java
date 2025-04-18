package k4;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.plantcare.ai.identifier.plantid.R;
import java.io.InputStream;
import s7.r0;

/* loaded from: classes.dex */
public final class e0 implements z, q4.a, l9.v {

    /* renamed from: b, reason: collision with root package name */
    public final Resources f20232b;

    public e0(Resources resources) {
        resources.getClass();
        this.f20232b = resources;
    }

    public String a(r0 r0Var) {
        int i10 = r0Var.f24719j;
        if (i10 == -1) {
            return "";
        }
        return this.f20232b.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(s7.r0 r10) {
        /*
            r9 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r10.f24714d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            java.lang.String r4 = ""
            r5 = 0
            if (r2 != 0) goto L63
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L18
            goto L63
        L18:
            int r2 = n9.h0.a
            r6 = 21
            if (r2 < r6) goto L23
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            goto L29
        L23:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r1)
            r1 = r6
        L29:
            r6 = 24
            if (r2 < r6) goto L34
            java.util.Locale$Category r2 = java.util.Locale.Category.DISPLAY
            java.util.Locale r2 = java.util.Locale.getDefault(r2)
            goto L38
        L34:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L38:
            java.lang.String r1 = r1.getDisplayName(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L43
            goto L63
        L43:
            int r6 = r1.offsetByCodePoints(r5, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L64
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r8 = r1.substring(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r2 = r8.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r2 = r1.substring(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r1 = r7.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L64
            goto L64
        L63:
            r1 = r4
        L64:
            r0[r5] = r1
            java.lang.String r1 = r9.d(r10)
            r0[r3] = r1
            java.lang.String r0 = r9.e(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L81
            java.lang.String r10 = r10.f24713c
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L7f
            goto L80
        L7f:
            r4 = r10
        L80:
            r0 = r4
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.e0.b(s7.r0):java.lang.String");
    }

    @Override // k4.z
    public y c(d0 d0Var) {
        return new m(this.f20232b, d0Var.b(Uri.class, InputStream.class));
    }

    public String d(r0 r0Var) {
        String str;
        int i10 = r0Var.f24716g;
        int i11 = i10 & 2;
        Resources resources = this.f20232b;
        if (i11 != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = "";
        }
        if ((i10 & 4) != 0) {
            str = e(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i10 & 8) != 0) {
            str = e(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i10 & 1088) != 0) {
            return e(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public String e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f20232b.getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }

    @Override // q4.a
    public g4.g0 i(g4.g0 g0Var, e4.m mVar) {
        if (g0Var == null) {
            return null;
        }
        return new n4.d(this.f20232b, g0Var);
    }

    public /* synthetic */ e0(int i10, Resources resources) {
        if (i10 != 1) {
            this.f20232b = resources;
        } else {
            this.f20232b = resources;
        }
    }
}
