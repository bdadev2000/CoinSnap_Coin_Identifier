package B3;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.C1863i;
import com.google.ar.core.C1864j;
import java.util.function.Consumer;
import u.BinderC2735d;

/* loaded from: classes2.dex */
public final class b implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f278c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f279d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f280f;

    public /* synthetic */ b(int i9, Object obj, Object obj2, int i10) {
        this.b = i10;
        this.f279d = obj;
        this.f280f = obj2;
        this.f278c = i9;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.function.Consumer, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f279d;
        int i9 = this.f278c;
        ?? r22 = this.f280f;
        switch (this.b) {
            case 0:
                ((BottomSheetBehavior) r22).K((View) obj, i9, false);
                return;
            case 1:
                ((X0.h) obj).a(i9, (Intent) r22);
                return;
            case 2:
                ((SystemForegroundService) r22).f5237g.notify(i9, (Notification) obj);
                return;
            case 3:
                switch (i9) {
                    case 0:
                        int i10 = C1863i.f14297d;
                        ((CameraDevice.StateCallback) obj).onOpened((CameraDevice) r22);
                        return;
                    case 1:
                        r22.accept(obj);
                        return;
                    case 2:
                        int i11 = C1863i.f14297d;
                        ((CameraDevice.StateCallback) obj).onDisconnected((CameraDevice) r22);
                        return;
                    case 3:
                        int i12 = C1863i.f14297d;
                        ((CameraDevice.StateCallback) obj).onClosed((CameraDevice) r22);
                        return;
                    case 4:
                        int i13 = C1864j.f14300d;
                        ((CameraCaptureSession.StateCallback) obj).onConfigured((CameraCaptureSession) r22);
                        return;
                    case 5:
                        int i14 = C1864j.f14300d;
                        ((CameraCaptureSession.StateCallback) obj).onConfigureFailed((CameraCaptureSession) r22);
                        return;
                    case 6:
                        int i15 = C1864j.f14300d;
                        ((CameraCaptureSession.StateCallback) obj).onReady((CameraCaptureSession) r22);
                        return;
                    case 7:
                        int i16 = C1864j.f14300d;
                        ((CameraCaptureSession.StateCallback) obj).onActive((CameraCaptureSession) r22);
                        return;
                    default:
                        int i17 = C1864j.f14300d;
                        ((CameraCaptureSession.StateCallback) obj).onClosed((CameraCaptureSession) r22);
                        return;
                }
            case 4:
                int i18 = C1863i.f14297d;
                ((CameraDevice.StateCallback) obj).onError((CameraDevice) r22, i9);
                return;
            case 5:
                ((TextView) obj).setTypeface((Typeface) r22, i9);
                return;
            default:
                ((BinderC2735d) r22).f23039c.onNavigationEvent(i9, (Bundle) obj);
                return;
        }
    }

    public /* synthetic */ b(Object obj, int i9, Parcelable parcelable, int i10) {
        this.b = i10;
        this.f280f = obj;
        this.f278c = i9;
        this.f279d = parcelable;
    }

    public /* synthetic */ b(Consumer consumer, ArCoreApk.Availability availability) {
        this.b = 3;
        this.f278c = 1;
        this.f280f = consumer;
        this.f279d = availability;
    }

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i9) {
        this.b = 0;
        this.f280f = bottomSheetBehavior;
        this.f279d = view;
        this.f278c = i9;
    }
}
