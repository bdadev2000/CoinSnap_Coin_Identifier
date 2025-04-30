package U0;

import android.os.Build;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, int i9) {
        super(str, str2);
        this.f3103d = i9;
    }

    @Override // U0.c
    public final boolean a() {
        switch (this.f3103d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            case 5:
                if (Build.VERSION.SDK_INT >= 28) {
                    return true;
                }
                return false;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
        }
    }
}
