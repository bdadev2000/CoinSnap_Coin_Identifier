package b2;

import E.g;
import N1.i;
import P1.B;
import a2.C0333b;
import a2.C0337f;
import j2.AbstractC2384b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c implements InterfaceC0554a {

    /* renamed from: c, reason: collision with root package name */
    public static final c f5275c = new c(0);
    public final /* synthetic */ int b;

    public /* synthetic */ c(int i9) {
        this.b = i9;
    }

    @Override // b2.InterfaceC0554a
    public final B a(B b, i iVar) {
        g gVar;
        byte[] bArr;
        switch (this.b) {
            case 0:
                return b;
            default:
                ByteBuffer asReadOnlyBuffer = ((C0337f) ((C0333b) b.get()).b.b).f3936a.f1967d.asReadOnlyBuffer();
                AtomicReference atomicReference = AbstractC2384b.f21014a;
                if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
                    gVar = new g(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
                } else {
                    gVar = null;
                }
                if (gVar != null && gVar.f843c == 0) {
                    if (gVar.f844d == ((byte[]) gVar.f845f).length) {
                        bArr = asReadOnlyBuffer.array();
                        return new W1.B(bArr);
                    }
                }
                ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                asReadOnlyBuffer2.get(bArr2);
                bArr = bArr2;
                return new W1.B(bArr);
        }
    }
}
