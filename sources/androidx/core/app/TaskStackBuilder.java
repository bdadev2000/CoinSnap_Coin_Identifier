package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18474a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f18475b;

    /* loaded from: classes2.dex */
    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    public TaskStackBuilder(Context context) {
        this.f18475b = context;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        p02.startActivity(p12);
    }

    public final void a(ComponentName componentName) {
        Context context = this.f18475b;
        ArrayList arrayList = this.f18474a;
        int size = arrayList.size();
        try {
            for (Intent b2 = NavUtils.b(context, componentName); b2 != null; b2 = NavUtils.b(context, b2.getComponent())) {
                arrayList.add(size, b2);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f18474a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f18475b;
        if (ContextCompat.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.f18474a.iterator();
    }
}
