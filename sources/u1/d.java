package u1;

import android.content.Context;
import com.plantcare.ai.identifier.plantid.data.database.AppDatabase;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.service.AlarmReceiver;
import com.plantcare.ai.identifier.plantid.service.BootReceiver;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25433c;

    public /* synthetic */ d(Context context, int i10) {
        this.f25432b = i10;
        this.f25433c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25432b;
        Context context = this.f25433c;
        switch (i10) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new d(context, 1));
                return;
            case 1:
                mi.a.q(context, new l.a(12), mi.a.f22243b, false);
                return;
            default:
                int i11 = BootReceiver.a;
                Iterator<AlarmEntity> it = AppDatabase.INSTANCE.getInstance(context).alarmDao().getAllRecordAlarmTypeList().iterator();
                while (it.hasNext()) {
                    AlarmReceiver.e(context, it.next());
                }
                return;
        }
    }
}
