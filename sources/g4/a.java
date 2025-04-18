package g4;

import android.util.Log;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new androidx.appcompat.widget.j(13, this, runnable), "glide-active-resources");
            case 1:
                return new j4.b(this, runnable, 0);
            default:
                j4.b bVar = new j4.b(this, runnable, 1);
                bVar.setName("csj_video_preload_" + bVar.getId());
                bVar.setDaemon(true);
                if (a5.v.a) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + bVar.getName());
                }
                return bVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a() {
        this(1);
        this.a = 1;
    }
}
