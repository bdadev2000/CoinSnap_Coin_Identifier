package okio.internal;

import d0.b0;
import java.io.IOException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import okio.BufferedSource;
import q0.p;

/* loaded from: classes2.dex */
public final class ZipFilesKt$readOrSkipLocalHeader$1 extends r implements p {
    final /* synthetic */ f0 $createdAtMillis;
    final /* synthetic */ f0 $lastAccessedAtMillis;
    final /* synthetic */ f0 $lastModifiedAtMillis;
    final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZipFilesKt$readOrSkipLocalHeader$1(BufferedSource bufferedSource, f0 f0Var, f0 f0Var2, f0 f0Var3) {
        super(2);
        this.$this_readOrSkipLocalHeader = bufferedSource;
        this.$lastModifiedAtMillis = f0Var;
        this.$lastAccessedAtMillis = f0Var2;
        this.$createdAtMillis = f0Var3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
        return b0.f30125a;
    }

    public final void invoke(int i2, long j2) {
        if (i2 == 21589) {
            if (j2 >= 1) {
                byte readByte = this.$this_readOrSkipLocalHeader.readByte();
                boolean z2 = (readByte & 1) == 1;
                boolean z3 = (readByte & 2) == 2;
                boolean z4 = (readByte & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j3 = z2 ? 5L : 1L;
                if (z3) {
                    j3 += 4;
                }
                if (z4) {
                    j3 += 4;
                }
                if (j2 < j3) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z2) {
                    this.$lastModifiedAtMillis.f30930a = Long.valueOf(bufferedSource.readIntLe() * 1000);
                }
                if (z3) {
                    this.$lastAccessedAtMillis.f30930a = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
                if (z4) {
                    this.$createdAtMillis.f30930a = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                    return;
                }
                return;
            }
            throw new IOException("bad zip: extended timestamp extra too short");
        }
    }
}
