package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    private final int f28783c;
    private final int d;

    /* renamed from: k0, reason: collision with root package name */
    private final long f28784k0;

    /* renamed from: k1, reason: collision with root package name */
    private final long f28785k1;

    /* loaded from: classes4.dex */
    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* renamed from: b, reason: collision with root package name */
        private long f28786b;

        /* renamed from: c, reason: collision with root package name */
        private final int f28787c;
        private final int d;
        private long finalM;

        /* renamed from: v0, reason: collision with root package name */
        private long f28788v0;
        private long v1;
        private long v2;
        private long v3;

        public SipHasher(int i2, int i3, long j2, long j3) {
            super(8);
            this.f28786b = 0L;
            this.finalM = 0L;
            this.f28787c = i2;
            this.d = i3;
            this.f28788v0 = 8317987319222330741L ^ j2;
            this.v1 = 7237128888997146477L ^ j3;
            this.v2 = 7816392313619706465L ^ j2;
            this.v3 = 8387220255154660723L ^ j3;
        }

        private void processM(long j2) {
            this.v3 ^= j2;
            sipRound(this.f28787c);
            this.f28788v0 = j2 ^ this.f28788v0;
        }

        private void sipRound(int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = this.f28788v0;
                long j3 = this.v1;
                this.f28788v0 = j2 + j3;
                this.v2 += this.v3;
                this.v1 = Long.rotateLeft(j3, 13);
                long rotateLeft = Long.rotateLeft(this.v3, 16);
                long j4 = this.v1;
                long j5 = this.f28788v0;
                this.v1 = j4 ^ j5;
                this.v3 = rotateLeft ^ this.v2;
                long rotateLeft2 = Long.rotateLeft(j5, 32);
                long j6 = this.v2;
                long j7 = this.v1;
                this.v2 = j6 + j7;
                this.f28788v0 = rotateLeft2 + this.v3;
                this.v1 = Long.rotateLeft(j7, 17);
                long rotateLeft3 = Long.rotateLeft(this.v3, 21);
                long j8 = this.v1;
                long j9 = this.v2;
                this.v1 = j8 ^ j9;
                this.v3 = rotateLeft3 ^ this.f28788v0;
                this.v2 = Long.rotateLeft(j9, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j2 = this.finalM ^ (this.f28786b << 56);
            this.finalM = j2;
            processM(j2);
            this.v2 ^= 255;
            sipRound(this.d);
            return HashCode.fromLong(((this.f28788v0 ^ this.v1) ^ this.v2) ^ this.v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            this.f28786b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f28786b += byteBuffer.remaining();
            int i2 = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (byteBuffer.get() & 255) << i2;
                i2 += 8;
            }
        }
    }

    public SipHashFunction(int i2, int i3, long j2, long j3) {
        Preconditions.checkArgument(i2 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i2);
        Preconditions.checkArgument(i3 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i3);
        this.f28783c = i2;
        this.d = i3;
        this.f28784k0 = j2;
        this.f28785k1 = j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        return this.f28783c == sipHashFunction.f28783c && this.d == sipHashFunction.d && this.f28784k0 == sipHashFunction.f28784k0 && this.f28785k1 == sipHashFunction.f28785k1;
    }

    public int hashCode() {
        return (int) ((((SipHashFunction.class.hashCode() ^ this.f28783c) ^ this.d) ^ this.f28784k0) ^ this.f28785k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f28783c, this.d, this.f28784k0, this.f28785k1);
    }

    public String toString() {
        int i2 = this.f28783c;
        int i3 = this.d;
        long j2 = this.f28784k0;
        long j3 = this.f28785k1;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i2);
        sb.append(i3);
        sb.append("(");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
