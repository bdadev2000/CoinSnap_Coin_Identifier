package com.bykv.vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.renderview.lMd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, lMd {
    private static final ArrayList<KS> KS = new ArrayList<>();
    private lMd.zp jU;
    private KS lMd;
    private WeakReference<zp> zp;

    public SSRenderSurfaceView(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        KS ks = new KS(this);
        this.lMd = ks;
        KS.add(ks);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.lMd
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
    }

    public void setWindowVisibilityChangedListener(lMd.zp zpVar) {
        this.jU = zpVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
        WeakReference<zp> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().zp(surfaceHolder, i9, i10, i11);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<zp> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().zp(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<zp> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().lMd(surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.lMd
    public void zp(zp zpVar) {
        this.zp = new WeakReference<>(zpVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<KS> it = KS.iterator();
        while (it.hasNext()) {
            KS next = it.next();
            if (next != null && next.zp() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.lMd);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.lMd
    public void zp(int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i9;
        setLayoutParams(layoutParams);
    }
}
