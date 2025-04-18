package com.mbridge.msdk.foundation.same.report;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class l extends com.mbridge.msdk.tracker.network.toolbox.a {
    private static final AtomicInteger a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private final byte f13512b;

    public l(byte b3) {
        this.f13512b = b3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd A[Catch: all -> 0x0134, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0134, blocks: (B:34:0x00be, B:37:0x00ce, B:40:0x00e0, B:46:0x00fd, B:49:0x0114, B:53:0x011c, B:54:0x0129), top: B:33:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #0 {all -> 0x0134, blocks: (B:34:0x00be, B:37:0x00ce, B:40:0x00e0, B:46:0x00fd, B:49:0x0114, B:53:0x011c, B:54:0x0129), top: B:33:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0095 A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:15:0x004a, B:17:0x005b, B:20:0x005f, B:21:0x0067, B:23:0x0074, B:26:0x0078, B:31:0x0096, B:32:0x00ae, B:68:0x0095, B:69:0x007d, B:70:0x00a4, B:71:0x0064), top: B:14:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007d A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:15:0x004a, B:17:0x005b, B:20:0x005f, B:21:0x0067, B:23:0x0074, B:26:0x0078, B:31:0x0096, B:32:0x00ae, B:68:0x0095, B:69:0x007d, B:70:0x00a4, B:71:0x0064), top: B:14:0x004a }] */
    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.tracker.network.toolbox.g a(com.mbridge.msdk.tracker.network.u<?> r12, java.util.Map<java.lang.String, java.lang.String> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 359
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
