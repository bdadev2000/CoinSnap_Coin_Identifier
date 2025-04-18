package org.jacoco.core.tools;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import org.jacoco.core.runtime.RemoteControlReader;
import org.jacoco.core.runtime.RemoteControlWriter;

/* loaded from: classes2.dex */
public class ExecDumpClient {
    private boolean dump = true;
    private boolean reset = false;
    private int retryCount = 0;
    private long retryDelay;

    public ExecDumpClient() {
        setRetryDelay(1000L);
    }

    private void sleep() throws InterruptedIOException {
        try {
            Thread.sleep(this.retryDelay);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    private Socket tryConnect(InetAddress inetAddress, int i2) throws IOException {
        int i3 = 0;
        while (true) {
            try {
                onConnecting(inetAddress, i2);
                return new Socket(inetAddress, i2);
            } catch (IOException e) {
                i3++;
                if (i3 > this.retryCount) {
                    throw e;
                }
                onConnectionFailure(e);
                sleep();
            }
        }
    }

    public ExecFileLoader dump(String str, int i2) throws IOException {
        return dump(InetAddress.getByName(str), i2);
    }

    public void onConnecting(InetAddress inetAddress, int i2) {
    }

    public void onConnectionFailure(IOException iOException) {
    }

    public void setDump(boolean z2) {
        this.dump = z2;
    }

    public void setReset(boolean z2) {
        this.reset = z2;
    }

    public void setRetryCount(int i2) {
        this.retryCount = i2;
    }

    public void setRetryDelay(long j2) {
        this.retryDelay = j2;
    }

    public ExecFileLoader dump(InetAddress inetAddress, int i2) throws IOException {
        ExecFileLoader execFileLoader = new ExecFileLoader();
        Socket tryConnect = tryConnect(inetAddress, i2);
        try {
            RemoteControlWriter remoteControlWriter = new RemoteControlWriter(tryConnect.getOutputStream());
            RemoteControlReader remoteControlReader = new RemoteControlReader(tryConnect.getInputStream());
            remoteControlReader.setSessionInfoVisitor(execFileLoader.getSessionInfoStore());
            remoteControlReader.setExecutionDataVisitor(execFileLoader.getExecutionDataStore());
            remoteControlWriter.visitDumpCommand(this.dump, this.reset);
            if (remoteControlReader.read()) {
                return execFileLoader;
            }
            throw new IOException("Socket closed unexpectedly.");
        } finally {
            tryConnect.close();
        }
    }
}
