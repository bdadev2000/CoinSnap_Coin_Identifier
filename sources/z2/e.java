package z2;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f24515a;
    public final String b;

    public e(View view, String str) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        G7.j.e(str, "viewMapKey");
        this.f24515a = new WeakReference(view);
        this.b = str;
    }

    public final View a() {
        WeakReference weakReference = this.f24515a;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
