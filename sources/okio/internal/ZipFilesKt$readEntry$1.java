package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import okio.BufferedSource;
import q0.p;

/* loaded from: classes2.dex */
public final class ZipFilesKt$readEntry$1 extends r implements p {
    final /* synthetic */ e0 $compressedSize;
    final /* synthetic */ b0 $hasZip64Extra;
    final /* synthetic */ e0 $offset;
    final /* synthetic */ long $requiredZip64ExtraSize;
    final /* synthetic */ e0 $size;
    final /* synthetic */ BufferedSource $this_readEntry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZipFilesKt$readEntry$1(b0 b0Var, long j2, e0 e0Var, BufferedSource bufferedSource, e0 e0Var2, e0 e0Var3) {
        super(2);
        this.$hasZip64Extra = b0Var;
        this.$requiredZip64ExtraSize = j2;
        this.$size = e0Var;
        this.$this_readEntry = bufferedSource;
        this.$compressedSize = e0Var2;
        this.$offset = e0Var3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
        return d0.b0.f30125a;
    }

    public final void invoke(int i2, long j2) {
        if (i2 == 1) {
            b0 b0Var = this.$hasZip64Extra;
            if (!b0Var.f30919a) {
                b0Var.f30919a = true;
                if (j2 >= this.$requiredZip64ExtraSize) {
                    e0 e0Var = this.$size;
                    long j3 = e0Var.f30927a;
                    if (j3 == 4294967295L) {
                        j3 = this.$this_readEntry.readLongLe();
                    }
                    e0Var.f30927a = j3;
                    e0 e0Var2 = this.$compressedSize;
                    e0Var2.f30927a = e0Var2.f30927a == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
                    e0 e0Var3 = this.$offset;
                    e0Var3.f30927a = e0Var3.f30927a == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
                    return;
                }
                throw new IOException("bad zip: zip64 extra too short");
            }
            throw new IOException("bad zip: zip64 extra repeated");
        }
    }
}
