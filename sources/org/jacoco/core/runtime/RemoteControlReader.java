package org.jacoco.core.runtime;

import java.io.IOException;
import java.io.InputStream;
import org.jacoco.core.data.ExecutionDataReader;

/* loaded from: classes4.dex */
public class RemoteControlReader extends ExecutionDataReader {
    private IRemoteCommandVisitor remoteCommandVisitor;

    public RemoteControlReader(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    private void readDumpCommand() throws IOException {
        if (this.remoteCommandVisitor == null) {
            throw new IOException("No remote command visitor.");
        }
        this.remoteCommandVisitor.visitDumpCommand(this.in.readBoolean(), this.in.readBoolean());
    }

    @Override // org.jacoco.core.data.ExecutionDataReader
    public boolean readBlock(byte b2) throws IOException {
        if (b2 == 32) {
            return false;
        }
        if (b2 != 64) {
            return super.readBlock(b2);
        }
        readDumpCommand();
        return true;
    }

    public void setRemoteCommandVisitor(IRemoteCommandVisitor iRemoteCommandVisitor) {
        this.remoteCommandVisitor = iRemoteCommandVisitor;
    }
}
