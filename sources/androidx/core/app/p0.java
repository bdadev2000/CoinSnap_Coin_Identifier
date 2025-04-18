package androidx.core.app;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class p0 {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1218b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1219c;

    /* renamed from: d, reason: collision with root package name */
    public int f1220d;

    /* renamed from: e, reason: collision with root package name */
    public int f1221e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1222f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1223g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1224h;

    public p0(int i10, String str, String str2, int i11, int i12, String str3, ArrayList arrayList) {
        this.f1218b = i10;
        this.f1219c = str;
        this.f1222f = str2;
        this.f1220d = i11;
        this.f1221e = i12;
        this.f1223g = str3;
        this.f1224h = arrayList;
    }

    public final q0 a() {
        String str = this.f1219c;
        Object obj = this.f1222f;
        if (str == null && ((PendingIntent) obj) == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        Object obj2 = this.f1224h;
        if (str == null && ((IconCompat) obj2) == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        return new q0((PendingIntent) obj, (PendingIntent) this.f1223g, (IconCompat) obj2, this.f1218b, this.f1220d, this.f1221e, str);
    }

    public final void b(int i10, boolean z10) {
        if (z10) {
            this.f1221e = i10 | this.f1221e;
        } else {
            this.f1221e = (~i10) & this.f1221e;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "Extra{flag=" + this.f1218b + ", rawKey='" + this.f1219c + "', key='" + ((String) this.f1222f) + "', from=" + this.f1220d + ", to=" + this.f1221e + ", urls=" + ((List) this.f1224h) + AbstractJsonLexerKt.END_OBJ;
            default:
                return super.toString();
        }
    }

    public p0(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1219c = str;
            return;
        }
        throw new NullPointerException("Bubble requires a non-null shortcut id");
    }

    public p0(PendingIntent pendingIntent, IconCompat iconCompat) {
        if (pendingIntent != null) {
            this.f1222f = pendingIntent;
            this.f1224h = iconCompat;
            return;
        }
        throw new NullPointerException("Bubble requires non-null pending intent");
    }
}
