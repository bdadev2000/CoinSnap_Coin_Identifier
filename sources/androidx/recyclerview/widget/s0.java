package androidx.recyclerview.widget;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 implements z1, a4.e, q4.a, k8.x, o0.u {

    /* renamed from: b, reason: collision with root package name */
    public int f2031b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2032c;

    public /* synthetic */ s0(int i10, Object[] objArr) {
        this.f2031b = i10;
        this.f2032c = objArr;
    }

    public static s0 g() {
        return new s0(8);
    }

    @Override // a4.e
    public void a(a4.l billingResult) {
        MainActivity mainActivity;
        a4.d dVar;
        List<IapDomain> iaps;
        IapActivity iapActivity;
        a4.d dVar2;
        int i10 = this.f2031b;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.f2032c;
        switch (i10) {
            case 0:
                Log.d("PurchaseEG", "onBillingSetupFinished:  " + billingResult.a);
                g3.c cVar = (g3.c) obj;
                if (!cVar.f18009d.booleanValue()) {
                    Log.d("PurchaseEG", "isPurchased : " + cVar.a.size());
                    if (cVar.f18007b != null) {
                        a4.d dVar3 = cVar.f18010e;
                        a4.m a = a4.a.a();
                        a.f153b = "inapp";
                        dVar3.p(a.a(), new g3.b(cVar, i11));
                    }
                    if (cVar.a != null) {
                        a4.d dVar4 = cVar.f18010e;
                        a4.m a10 = a4.a.a();
                        a10.f153b = "subs";
                        dVar4.p(a10.a(), new g3.b(cVar, i12));
                    }
                }
                cVar.f18009d = Boolean.TRUE;
                int i13 = billingResult.a;
                if (i13 == 0) {
                    if (cVar.f18007b.size() > 0) {
                        kc.c cVar2 = new kc.c();
                        cVar2.u(cVar.f18007b);
                        cVar.f18010e.I(new f.a(cVar2), new kc.c(this, 14));
                    }
                    if (cVar.a.size() > 0) {
                        kc.c cVar3 = new kc.c();
                        cVar3.u(cVar.a);
                        cVar.f18010e.I(new f.a(cVar3), new f.a(this, 13));
                        return;
                    }
                    return;
                }
                if (i13 == 2 || i13 == 6) {
                    Log.e("PurchaseEG", "onBillingSetupFinished:ERROR ");
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (hf.f.c()) {
                    iaps = va.b.m();
                } else {
                    iaps = va.b.n();
                }
                Intrinsics.checkNotNullParameter(iaps, "iaps");
                ArrayList arrayList = new ArrayList();
                int size = iaps.size();
                while (true) {
                    if (i11 < size) {
                        if (((IapDomain) iaps.get(i11)).isTypeSubYear()) {
                            iaps.remove(i11);
                        } else {
                            i11++;
                        }
                    }
                }
                for (IapDomain iapDomain : iaps) {
                    a4.y yVar = new a4.y();
                    yVar.f170b = iapDomain.getIdSub();
                    yVar.f171c = "inapp";
                    a4.z a11 = yVar.a();
                    Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
                    arrayList.add(a11);
                }
                kc.c cVar4 = new kc.c();
                cVar4.u(arrayList);
                f.a aVar = new f.a(cVar4);
                Intrinsics.checkNotNullExpressionValue(aVar, "build(...)");
                if (billingResult.a == 0 && (dVar2 = (iapActivity = (IapActivity) obj).f16630g) != null) {
                    dVar2.I(aVar, new ag.a(iapActivity));
                }
                IapActivity.t((IapActivity) obj);
                return;
            default:
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                a4.y yVar2 = new a4.y();
                yVar2.f170b = va.b.l().getIdSub();
                yVar2.f171c = "inapp";
                List mutableListOf = CollectionsKt.mutableListOf(yVar2.a());
                kc.c cVar5 = new kc.c();
                cVar5.u(mutableListOf);
                f.a aVar2 = new f.a(cVar5);
                Intrinsics.checkNotNullExpressionValue(aVar2, "build(...)");
                if (billingResult.a == 0 && (dVar = (mainActivity = (MainActivity) obj).f16650o) != null) {
                    dVar.I(aVar2, new fg.a(mainActivity));
                }
                MainActivity.J((MainActivity) obj);
                return;
        }
    }

    @Override // k8.x
    public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // k8.x
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // a4.e
    public void d() {
        int i10 = this.f2031b;
        Object obj = this.f2032c;
        switch (i10) {
            case 0:
                ((g3.c) obj).getClass();
                return;
            case 1:
                IapActivity iapActivity = (IapActivity) obj;
                int i11 = IapActivity.f16628k;
                a4.d dVar = iapActivity.f16630g;
                if (dVar != null) {
                    dVar.J(new s0(iapActivity, 1));
                    return;
                }
                return;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                int i12 = MainActivity.f16644q;
                a4.d dVar2 = mainActivity.f16650o;
                if (dVar2 != null) {
                    dVar2.J(new s0(mainActivity, 2));
                    return;
                }
                return;
        }
    }

    public void e(long j3) {
        int i10 = this.f2031b;
        Object obj = this.f2032c;
        if (i10 == ((long[]) obj).length) {
            this.f2032c = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        long[] jArr = (long[]) this.f2032c;
        int i11 = this.f2031b;
        this.f2031b = i11 + 1;
        jArr[i11] = j3;
    }

    public yb.a f() {
        return new yb.a(this.f2031b, (yb.d) this.f2032c);
    }

    @Override // k8.x
    public int getCodecCount() {
        if (((MediaCodecInfo[]) this.f2032c) == null) {
            this.f2032c = new MediaCodecList(this.f2031b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2032c).length;
    }

    @Override // k8.x
    public MediaCodecInfo getCodecInfoAt(int i10) {
        if (((MediaCodecInfo[]) this.f2032c) == null) {
            this.f2032c = new MediaCodecList(this.f2031b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2032c)[i10];
    }

    public long h(int i10) {
        if (i10 >= 0 && i10 < this.f2031b) {
            return ((long[]) this.f2032c)[i10];
        }
        StringBuilder m10 = a4.j.m("Invalid index ", i10, ", size is ");
        m10.append(this.f2031b);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    @Override // q4.a
    public g4.g0 i(g4.g0 g0Var, e4.m mVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) g0Var.get()).compress((Bitmap.CompressFormat) this.f2032c, this.f2031b, byteArrayOutputStream);
        g0Var.a();
        return new n4.z(byteArrayOutputStream.toByteArray());
    }

    public int j(View view) {
        int decoratedBottom;
        int i10;
        int i11 = this.f2031b;
        Object obj = this.f2032c;
        switch (i11) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                decoratedBottom = ((v0) obj).getDecoratedRight(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                decoratedBottom = ((v0) obj).getDecoratedBottom(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).bottomMargin;
                break;
        }
        return decoratedBottom + i10;
    }

    public int k(View view) {
        int decoratedTop;
        int i10;
        int i11 = this.f2031b;
        Object obj = this.f2032c;
        switch (i11) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                decoratedTop = ((v0) obj).getDecoratedLeft(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                decoratedTop = ((v0) obj).getDecoratedTop(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).topMargin;
                break;
        }
        return decoratedTop - i10;
    }

    public int l() {
        int height;
        int paddingBottom;
        int i10 = this.f2031b;
        Object obj = this.f2032c;
        switch (i10) {
            case 0:
                v0 v0Var = (v0) obj;
                height = v0Var.getWidth();
                paddingBottom = v0Var.getPaddingRight();
                break;
            default:
                v0 v0Var2 = (v0) obj;
                height = v0Var2.getHeight();
                paddingBottom = v0Var2.getPaddingBottom();
                break;
        }
        return height - paddingBottom;
    }

    public long m(y7.h hVar) {
        int i10 = 0;
        hVar.peekFully(((n9.x) this.f2032c).a, 0, 1, false);
        int i11 = ((n9.x) this.f2032c).a[0] & UByte.MAX_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        hVar.peekFully(((n9.x) this.f2032c).a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (((n9.x) this.f2032c).a[i10] & UByte.MAX_VALUE) + (i14 << 8);
        }
        this.f2031b = i13 + 1 + this.f2031b;
        return i14;
    }

    @Override // o0.u
    public boolean p(View view) {
        ((BottomSheetBehavior) this.f2032c).I(this.f2031b);
        return true;
    }

    @Override // k8.x
    public boolean secureDecodersExplicit() {
        return true;
    }

    public /* synthetic */ s0(Object obj, int i10) {
        this.f2031b = i10;
        this.f2032c = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i10) {
        this(Bitmap.CompressFormat.JPEG, 100);
        if (i10 == 3) {
            this.f2032c = com.facebook.appevents.q.SUCCESS;
            return;
        }
        if (i10 == 4) {
            this.f2032c = new n9.x(8);
            return;
        }
        if (i10 == 6) {
            this();
        } else if (i10 != 8) {
        } else {
            this.f2032c = yb.d.DEFAULT;
        }
    }

    public s0() {
        this.f2032c = new long[32];
    }

    public s0(boolean z10, boolean z11) {
        this.f2031b = (z10 || z11) ? 1 : 0;
    }
}
