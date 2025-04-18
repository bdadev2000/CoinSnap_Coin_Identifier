package com.bytedance.sdk.openadsdk.AlY;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class YoT {
    private static volatile YoT YFl;
    private HandlerThread Sg;
    private final Handler tN;

    /* renamed from: vc, reason: collision with root package name */
    private Map<String, Object> f10498vc;
    private final Executor AlY = Executors.newCachedThreadPool();
    private Sg wN = Sg.YFl();

    /* loaded from: classes.dex */
    public static class Sg {
        public int YFl = 300;
        public int Sg = 6000;

        private Sg() {
        }

        public static Sg YFl() {
            return new Sg();
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements Serializable, Runnable {
        public String AlY;
        public Wwa tN;
        public Map<String, Object> wN;
        public final AtomicInteger YFl = new AtomicInteger(0);
        public final AtomicBoolean Sg = new AtomicBoolean(false);

        public YFl(Wwa wwa, String str, Map<String, Object> map) {
            this.tN = wwa;
            this.AlY = str;
            this.wN = map;
        }

        public static YFl YFl(Wwa wwa, String str, Map<String, Object> map) {
            return new YFl(wwa, str, map);
        }

        public void Sg() {
            this.YFl.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            boolean z10;
            if (this.tN != null && !TextUtils.isEmpty(this.AlY)) {
                if (this.Sg.get()) {
                    str = "dpl_success";
                } else {
                    str = "dpl_failed";
                }
                if (this.wN == null) {
                    this.wN = new HashMap();
                }
                Wwa wwa = this.tN;
                if (wwa != null && wwa.Ja() == 0) {
                    Map<String, Object> map = this.wN;
                    Wwa wwa2 = this.tN;
                    if (wwa2 != null && !wwa2.AlY()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    map.put("auto_click", Boolean.valueOf(z10));
                }
                this.wN.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.EH.YFl().tN()));
                tN.YFl(this.tN, this.AlY, str, this.wN);
            }
        }

        public YFl YFl(boolean z10) {
            this.Sg.set(z10);
            return this;
        }

        public int YFl() {
            return this.YFl.get();
        }
    }

    private YoT() {
        if (this.Sg == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.Sg = handlerThread;
            handlerThread.start();
        }
        this.tN = new Handler(this.Sg.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.AlY.YoT.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                YFl yFl;
                if (message.what == 100) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof YFl)) {
                        yFl = (YFl) obj;
                    } else {
                        yFl = null;
                    }
                    if (yFl != null) {
                        YoT.this.Sg(yFl);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(YFl yFl) {
        if (yFl == null) {
            return;
        }
        boolean AlY = com.bytedance.sdk.openadsdk.core.EH.YFl().AlY();
        boolean YFl2 = com.bytedance.sdk.openadsdk.core.EH.YFl().YFl(true);
        if (!AlY && YFl2) {
            YFl(yFl);
            return;
        }
        if (yFl.wN == null) {
            yFl.wN = new HashMap();
        }
        yFl.wN.put("is_background", Boolean.valueOf(AlY));
        yFl.wN.put("has_focus", Boolean.valueOf(YFl2));
        tN(yFl.YFl(true));
    }

    private void tN(YFl yFl) {
        if (yFl == null) {
            return;
        }
        this.AlY.execute(yFl);
    }

    public static YoT YFl() {
        if (YFl == null) {
            synchronized (YoT.class) {
                if (YFl == null) {
                    YFl = new YoT();
                }
            }
        }
        return YFl;
    }

    public YoT YFl(Map<String, Object> map) {
        this.f10498vc = map;
        return YFl();
    }

    public void YFl(Wwa wwa, String str) {
        Message obtainMessage = this.tN.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = YFl.YFl(wwa, str, this.f10498vc);
        obtainMessage.sendToTarget();
    }

    private void YFl(YFl yFl) {
        if (yFl == null) {
            return;
        }
        yFl.Sg();
        int YFl2 = yFl.YFl();
        Sg sg2 = this.wN;
        if (YFl2 * sg2.YFl > sg2.Sg) {
            tN(yFl.YFl(false));
            return;
        }
        Message obtainMessage = this.tN.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = yFl;
        this.tN.sendMessageDelayed(obtainMessage, this.wN.YFl);
    }
}
