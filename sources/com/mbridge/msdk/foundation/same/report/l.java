package com.mbridge.msdk.foundation.same.report;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class l extends com.mbridge.msdk.tracker.network.toolbox.a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f15951a = new AtomicInteger(1);
    private final byte b;

    public l(byte b) {
        this.b = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109 A[Catch: all -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00ff, blocks: (B:35:0x00c4, B:38:0x00d4, B:41:0x00e6, B:47:0x0109, B:50:0x0120, B:52:0x0124, B:53:0x0131), top: B:34:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120 A[Catch: all -> 0x00ff, TRY_ENTER, TryCatch #5 {all -> 0x00ff, blocks: (B:35:0x00c4, B:38:0x00d4, B:41:0x00e6, B:47:0x0109, B:50:0x0120, B:52:0x0124, B:53:0x0131), top: B:34:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009b A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:15:0x004a, B:17:0x005b, B:20:0x005f, B:21:0x006d, B:23:0x007a, B:26:0x007e, B:31:0x009c, B:32:0x00b4, B:65:0x009b, B:66:0x0083, B:67:0x00aa, B:68:0x006a), top: B:14:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0083 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:15:0x004a, B:17:0x005b, B:20:0x005f, B:21:0x006d, B:23:0x007a, B:26:0x007e, B:31:0x009c, B:32:0x00b4, B:65:0x009b, B:66:0x0083, B:67:0x00aa, B:68:0x006a), top: B:14:0x004a }] */
    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.tracker.network.toolbox.g a(com.mbridge.msdk.tracker.network.u<?> r12, java.util.Map<java.lang.String, java.lang.String> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.l.a(com.mbridge.msdk.tracker.network.u, java.util.Map):com.mbridge.msdk.tracker.network.toolbox.g");
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    private void a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                byteBuffer.clear();
            } catch (Exception unused) {
            }
        }
    }
}
