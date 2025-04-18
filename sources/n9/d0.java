package n9;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d0 {
    public Message a;

    public final void a() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        this.a = null;
        ArrayList arrayList = e0.f22535b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }
}
