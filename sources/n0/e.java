package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e implements d, f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22258b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ClipData f22259c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22260d;

    /* renamed from: f, reason: collision with root package name */
    public int f22261f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f22262g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f22263h;

    public e(e eVar) {
        ClipData clipData = eVar.f22259c;
        clipData.getClass();
        this.f22259c = clipData;
        int i10 = eVar.f22260d;
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i10 <= 5) {
            this.f22260d = i10;
            int i11 = eVar.f22261f;
            if ((i11 & 1) == i11) {
                this.f22261f = i11;
                this.f22262g = eVar.f22262g;
                this.f22263h = eVar.f22263h;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
    }

    @Override // n0.d
    public final void a(Uri uri) {
        this.f22262g = uri;
    }

    @Override // n0.d
    public final void b(int i10) {
        this.f22261f = i10;
    }

    @Override // n0.d
    public final g build() {
        return new g(new e(this));
    }

    @Override // n0.f
    public final int getSource() {
        return this.f22260d;
    }

    @Override // n0.f
    public final ContentInfo m() {
        return null;
    }

    @Override // n0.f
    public final ClipData o() {
        return this.f22259c;
    }

    @Override // n0.f
    public final int s() {
        return this.f22261f;
    }

    @Override // n0.d
    public final void setExtras(Bundle bundle) {
        this.f22263h = bundle;
    }

    public final String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f22258b) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f22259c.getDescription());
                sb2.append(", source=");
                int i10 = this.f22260d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        str = String.valueOf(i10);
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
                sb2.append(str);
                sb2.append(", flags=");
                int i11 = this.f22261f;
                if ((i11 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i11);
                }
                sb2.append(valueOf);
                String str3 = "";
                if (this.f22262g == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + this.f22262g.toString().length() + ")";
                }
                sb2.append(str2);
                if (this.f22263h != null) {
                    str3 = ", hasExtras";
                }
                return vd.e.h(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public e(ClipData clipData, int i10) {
        this.f22259c = clipData;
        this.f22260d = i10;
    }
}
