package l2;

import android.os.Build;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, int i10) {
        super(str, str2);
        this.f21113d = i10;
    }

    @Override // l2.c
    public final boolean a() {
        switch (this.f21113d) {
            case 0:
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                return true;
            case 4:
                if (Build.VERSION.SDK_INT < 27) {
                    return false;
                }
                return true;
            case 5:
                if (Build.VERSION.SDK_INT < 28) {
                    return false;
                }
                return true;
            default:
                if (Build.VERSION.SDK_INT < 29) {
                    return false;
                }
                return true;
        }
    }
}
