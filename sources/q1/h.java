package q1;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import com.facebook.appevents.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {
    public static final g a(Context context) {
        s1.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Log.d("MeasurementManager", "AdServicesInfo.version=" + o.z());
        if (o.z() >= 5) {
            bVar = new s1.b(context);
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        return new g(bVar);
    }

    public abstract ua.b b();

    public abstract ua.b c(Uri uri, InputEvent inputEvent);

    public abstract ua.b d(Uri uri);
}
