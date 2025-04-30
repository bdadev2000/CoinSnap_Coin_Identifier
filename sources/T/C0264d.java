package T;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import x0.AbstractC2914a;

/* renamed from: T.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264d implements InterfaceC0262c, InterfaceC0266e {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public ClipData f2880c;

    /* renamed from: d, reason: collision with root package name */
    public int f2881d;

    /* renamed from: f, reason: collision with root package name */
    public int f2882f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f2883g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f2884h;

    public /* synthetic */ C0264d() {
    }

    @Override // T.InterfaceC0266e
    public ClipData a() {
        return this.f2880c;
    }

    @Override // T.InterfaceC0262c
    public C0268f build() {
        return new C0268f(new C0264d(this));
    }

    @Override // T.InterfaceC0266e
    public int c() {
        return this.f2882f;
    }

    @Override // T.InterfaceC0262c
    public void d(Uri uri) {
        this.f2883g = uri;
    }

    @Override // T.InterfaceC0262c
    public void f(int i9) {
        this.f2882f = i9;
    }

    @Override // T.InterfaceC0266e
    public ContentInfo g() {
        return null;
    }

    @Override // T.InterfaceC0266e
    public int k() {
        return this.f2881d;
    }

    @Override // T.InterfaceC0262c
    public void setExtras(Bundle bundle) {
        this.f2884h = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.b) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2880c.getDescription());
                sb.append(", source=");
                int i9 = this.f2881d;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i9 != 4) {
                                    if (i9 != 5) {
                                        str = String.valueOf(i9);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i10 = this.f2882f;
                if ((i10 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i10);
                }
                sb.append(valueOf);
                String str3 = "";
                Uri uri = this.f2883g;
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (this.f2884h != null) {
                    str3 = ", hasExtras";
                }
                return AbstractC2914a.h(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    public C0264d(C0264d c0264d) {
        ClipData clipData = c0264d.f2880c;
        clipData.getClass();
        this.f2880c = clipData;
        int i9 = c0264d.f2881d;
        if (i9 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i9 <= 5) {
            this.f2881d = i9;
            int i10 = c0264d.f2882f;
            if ((i10 & 1) == i10) {
                this.f2882f = i10;
                this.f2883g = c0264d.f2883g;
                this.f2884h = c0264d.f2884h;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
