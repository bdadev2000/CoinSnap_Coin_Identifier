package nd;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22736b = 0;
    public final ArrayList a = new ArrayList();

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public final f a(View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.a.get() == view) {
                return fVar;
            }
        }
        return null;
    }
}
