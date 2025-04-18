package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.MultiTapDetector;
import java.util.Collection;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20911c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i2, Object obj, Object obj2, int i3) {
        this.f20909a = i3;
        this.d = obj;
        this.f20910b = i2;
        this.f20911c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f20909a;
        int i3 = this.f20910b;
        Object obj = this.f20911c;
        Object obj2 = this.d;
        switch (i2) {
            case 0:
                ((DeviceProfileWriter) obj2).f20873b.b(i3, obj);
                return;
            case 1:
                ((ProfileInstaller.DiagnosticsCallback) obj2).b(i3, obj);
                return;
            case 2:
                ((MaxAdPlacer) obj2).a(i3, (Collection) obj);
                return;
            default:
                MultiTapDetector.a((MultiTapDetector) obj2, (MultiTapDetector.Event) obj, i3);
                return;
        }
    }

    public /* synthetic */ a(MultiTapDetector multiTapDetector, MultiTapDetector.Event event, int i2) {
        this.f20909a = 3;
        this.d = multiTapDetector;
        this.f20911c = event;
        this.f20910b = i2;
    }
}
