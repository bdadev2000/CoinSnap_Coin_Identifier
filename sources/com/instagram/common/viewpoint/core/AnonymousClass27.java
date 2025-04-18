package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.27, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass27 extends Handler {
    public static byte[] A0A;
    public Messenger A00;
    public boolean A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final AbstractC1156bi A06;
    public final C1045Zs A07;
    public final C1044Zr A08;
    public final KY A09;

    static {
        A07();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-22, -17, -11, 0, -13, -9, 0, -30, -15, -15, 0, -16, -13, -22, -26, -17, -11, -30, -11, -22, -16, -17, 0, -20, -26, -6, -55, -36, -28, -26, -21, -36, -105, -22, -36, -23, -19, -32, -38, -36, -105, -36, -23, -23, -26, -23, -91, -53, -52, -54, -41, -71, -68, -41, -63, -68, -41, -61, -67, -47, -49, -62, -66, -48, -83, -46, -55, -66};
    }

    public AnonymousClass27(C1045Zs c1045Zs, AbstractC1156bi abstractC1156bi) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnection() { // from class: com.facebook.ads.redexgen.X.26
            public static String[] A01 = {"5NfIE0YcA1j7k4kI09Qd", "GOyJyQVDSAttzLj2dwW1R", "UEE9UjADaku6tgIVG7TE", "AlbuaripePsmIRlIONJuvTINhX", "hDpBwlS77lkTDgpWlwn57aFtHcNJW0B1", "G5FnfniCDoZltv23hjG8RcIHEgm214hW", "K1Tu", "8SU16w9FmjIzUCDhhEyMBCCw6KqJKOI3"};

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C1045Zs c1045Zs2;
                Handler handler;
                KY ky;
                AbstractC1156bi abstractC1156bi2;
                C1045Zs c1045Zs3;
                c1045Zs2 = AnonymousClass27.this.A07;
                c1045Zs2.A0E().AFO();
                handler = AnonymousClass27.this.A04;
                ky = AnonymousClass27.this.A09;
                handler.removeCallbacks(ky);
                if (iBinder != null) {
                    AnonymousClass27.this.A00 = new Messenger(iBinder);
                    if (AnonymousClass27.this.A02) {
                        AnonymousClass27.this.A02 = false;
                        abstractC1156bi2 = AnonymousClass27.this.A06;
                        abstractC1156bi2.A06();
                        return;
                    }
                    return;
                }
                c1045Zs3 = AnonymousClass27.this.A07;
                c1045Zs3.A0E().AFQ();
                AnonymousClass27 anonymousClass27 = AnonymousClass27.this;
                if (A01[3].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "klTZBPtNd5GFvPmgAP3f";
                strArr[2] = "mBOUVEJ7kKkpCLxr10ij";
                anonymousClass27.A06();
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                C1045Zs c1045Zs2;
                c1045Zs2 = AnonymousClass27.this.A07;
                c1045Zs2.A0E().AFP();
                if (!AnonymousClass27.this.A01) {
                    return;
                }
                AnonymousClass27.this.A06();
            }
        };
        this.A07 = c1045Zs;
        this.A08 = c1045Zs.A01();
        this.A05 = new Messenger(this);
        this.A06 = abstractC1156bi;
        this.A09 = new C1141bT(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6J() == EnumC02141z.A06 || this.A06.A03().A6K() == EnumC02141z.A07) {
            this.A07.A0E().AFF();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
        } else {
            if (this.A06.A03().A6J() != EnumC02141z.A05) {
                return;
            }
            this.A07.A0E().AFL();
            this.A06.A03().AGQ(new AdError(AdError.REMOTE_ADS_SERVICE_ERROR, A04(26, 21, 33)));
        }
    }

    private void A08(Messenger messenger, int i2, Bundle bundle) throws RemoteException {
        Message obtain = Message.obtain((Handler) null, i2);
        obtain.replyTo = this.A05;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.getData().putString(A04(47, 13, 34), this.A06.A04());
        messenger.send(obtain);
    }

    public static void A0B(C1045Zs c1045Zs) {
        c1045Zs.A0E().AF9();
        InterfaceC03427f A0F = c1045Zs.A0F();
        if (A0F != null && A0F.A6I() != null && A0F.A6E() != null) {
            A0F.A6I().onError(A0F.A6E(), AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0E().AFW();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(C1045Zs c1045Zs, int i2) {
        this.A07.A0E().AFV();
        AdActivityIntent A04 = C0659Kq.A04(c1045Zs);
        A04.putExtra(A04(60, 8, 3), KG.A0E);
        A04.putExtra(A04(47, 13, 34), this.A06.A04());
        A04.putExtra(A04(0, 26, 75), i2);
        try {
            if (!C0659Kq.A0E(c1045Zs, A04)) {
                A0B(c1045Zs);
            }
        } catch (C0657Ko unused) {
            A0B(c1045Zs);
        }
    }

    public final void A0E(boolean z2) {
        this.A01 = AnonymousClass28.A04(this.A08, z2, this.A03);
        if (this.A01) {
            this.A07.A0E().AFB();
            this.A04.postDelayed(this.A09, AbstractC0610Ip.A00(this.A08));
        } else {
            this.A07.A0E().AFJ();
            this.A02 = false;
            this.A06.A09();
        }
    }

    public final boolean A0F(int i2, Bundle bundle) {
        try {
            Messenger service = this.A00;
            if (service != null) {
                A08(service, i2, bundle);
                return true;
            }
            return false;
        } catch (RemoteException e) {
            A0C();
            this.A07.A0E().AFE(e);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0E().AFS();
                    AbstractC0610Ip.A06(this.A08);
                } else {
                    this.A07.A0E().AFR();
                }
                A05();
                return;
            }
            String adId = message.getData().getString(A04(47, 13, 34));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0E().AFX();
            } else if (message.what == 2001 || message.what == 1011) {
                AnonymousClass28.A02(this.A08, message);
            } else {
                this.A07.A0E().AFK(message.what);
                this.A06.A0C(message);
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
