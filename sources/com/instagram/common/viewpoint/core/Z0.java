package com.instagram.common.viewpoint.core;

import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class Z0 implements InterfaceC0414Ag {
    public static String[] A06 = {"x4SLKw0ecPcHsWHgO1Td4vJ14144RMMS", "Zh7tfC3TFBRtLhPe9z1RavfnQghohUvM", "5a1nSgSc9ubjxiTpcQH3XZ5BSJHYyomE", "9hzCYTVbSoKGzhiGE0INbgm8vz2Ul1tD", "U5QynYTJKvqXrBDteFA3kKN8MUDMbs9q", "vYVMMAOqO79qbNxEgxq93Z6FBxHJHfxt", "X8bjNxmBNAlkg", "EWWs7bfWX2zABqEPcCAhkdtns4Cu5rHI"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = InterfaceC0414Ag.A00;
    public ByteBuffer A04 = InterfaceC0414Ag.A00;

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A4m(int i2, int i3, int i4) throws C0413Af {
        if (i4 == 3 || i4 == 2 || i4 == Integer.MIN_VALUE || i4 == 1073741824) {
            if (this.A02 == i2 && this.A00 == i3 && this.A01 == i4) {
                return false;
            }
            this.A02 = i2;
            this.A00 = i3;
            this.A01 = i4;
            return true;
        }
        throw new C0413Af(i2, i3, i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final ByteBuffer A7u() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = InterfaceC0414Ag.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7v() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7x() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A9L() {
        return (this.A01 == 0 || this.A01 == 2) ? false : true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A9Q() {
        if (this.A05) {
            ByteBuffer byteBuffer = this.A04;
            ByteBuffer byteBuffer2 = InterfaceC0414Ag.A00;
            if (A06[3].charAt(27) != 'U') {
                throw new RuntimeException();
            }
            A06[6] = "37MFS79N5bC4O";
            if (byteBuffer == byteBuffer2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void AEh() {
        this.A05 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x005e. Please report as an issue. */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void AEi(ByteBuffer byteBuffer) {
        int limit;
        int i2 = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int limit2 = resampledSize - i2;
        int position = this.A01;
        switch (position) {
            case Integer.MIN_VALUE:
                int position2 = limit2 / 3;
                limit = position2 * 2;
                break;
            case 3:
                limit = limit2 * 2;
                break;
            case Ints.MAX_POWER_OF_TWO /* 1073741824 */:
                limit = limit2 / 2;
                break;
            default:
                throw new IllegalStateException();
        }
        int position3 = this.A03.capacity();
        if (position3 < limit) {
            this.A03 = ByteBuffer.allocateDirect(limit).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        int i3 = this.A01;
        String[] strArr = A06;
        String str = strArr[1];
        String str2 = strArr[0];
        int limit3 = str.charAt(21);
        int position4 = str2.charAt(21);
        if (limit3 != position4) {
            throw new RuntimeException();
        }
        A06[4] = "sqNpl1OaV4AX2PiDopzrEiO6zTyyi8x2";
        switch (i3) {
            case Integer.MIN_VALUE:
                while (i2 < resampledSize) {
                    int position5 = i2 + 1;
                    this.A03.put(byteBuffer.get(position5));
                    int position6 = i2 + 2;
                    this.A03.put(byteBuffer.get(position6));
                    i2 += 3;
                }
                int position7 = byteBuffer.limit();
                byteBuffer.position(position7);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case 3:
                while (i2 < resampledSize) {
                    this.A03.put((byte) 0);
                    ByteBuffer byteBuffer2 = this.A03;
                    int position8 = byteBuffer.get(i2);
                    byteBuffer2.put((byte) ((position8 & 255) - 128));
                    i2++;
                }
                int position72 = byteBuffer.limit();
                byteBuffer.position(position72);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case Ints.MAX_POWER_OF_TWO /* 1073741824 */:
                while (i2 < resampledSize) {
                    int position9 = i2 + 2;
                    this.A03.put(byteBuffer.get(position9));
                    int position10 = i2 + 3;
                    this.A03.put(byteBuffer.get(position10));
                    i2 += 4;
                }
                int position722 = byteBuffer.limit();
                byteBuffer.position(position722);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void flush() {
        this.A04 = InterfaceC0414Ag.A00;
        this.A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = InterfaceC0414Ag.A00;
    }
}
