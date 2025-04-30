package D0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f623a = 2;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f624c;

    public /* synthetic */ k() {
    }

    public String toString() {
        String str;
        switch (this.f623a) {
            case 1:
                if (this.f624c) {
                    str = "Applink";
                } else {
                    str = "Unclassified";
                }
                String str2 = this.b;
                if (str2 != null) {
                    return str + '(' + ((Object) str2) + ')';
                }
                return str;
            default:
                return super.toString();
        }
    }

    public k(String str, boolean z8) {
        this.b = str;
        this.f624c = z8;
    }

    public k(boolean z8, String str) {
        this.f624c = z8;
        this.b = str;
    }
}
