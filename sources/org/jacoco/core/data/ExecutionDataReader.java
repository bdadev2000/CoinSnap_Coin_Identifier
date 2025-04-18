package org.jacoco.core.data;

import java.io.IOException;
import java.io.InputStream;
import org.jacoco.core.internal.data.CompactDataInput;

/* loaded from: classes2.dex */
public class ExecutionDataReader {
    protected final CompactDataInput in;
    private ISessionInfoVisitor sessionInfoVisitor = null;
    private IExecutionDataVisitor executionDataVisitor = null;
    private boolean firstBlock = true;

    public ExecutionDataReader(InputStream inputStream) {
        this.in = new CompactDataInput(inputStream);
    }

    private void readExecutionData() throws IOException {
        if (this.executionDataVisitor == null) {
            throw new IOException("No execution data visitor.");
        }
        this.executionDataVisitor.visitClassExecution(new ExecutionData(this.in.readLong(), this.in.readUTF(), this.in.readBooleanArray()));
    }

    private void readHeader() throws IOException {
        if (this.in.readChar() != 49344) {
            throw new IOException("Invalid execution data file.");
        }
        char readChar = this.in.readChar();
        if (readChar != ExecutionDataWriter.FORMAT_VERSION) {
            throw new IncompatibleExecDataVersionException(readChar);
        }
    }

    private void readSessionInfo() throws IOException {
        if (this.sessionInfoVisitor == null) {
            throw new IOException("No session info visitor.");
        }
        this.sessionInfoVisitor.visitSessionInfo(new SessionInfo(this.in.readUTF(), this.in.readLong(), this.in.readLong()));
    }

    public boolean read() throws IOException, IncompatibleExecDataVersionException {
        byte b2;
        do {
            int read = this.in.read();
            if (read == -1) {
                return false;
            }
            b2 = (byte) read;
            if (this.firstBlock && b2 != 1) {
                throw new IOException("Invalid execution data file.");
            }
            this.firstBlock = false;
        } while (readBlock(b2));
        return true;
    }

    public boolean readBlock(byte b2) throws IOException {
        if (b2 == 1) {
            readHeader();
            return true;
        }
        if (b2 == 16) {
            readSessionInfo();
            return true;
        }
        if (b2 != 17) {
            throw new IOException(String.format("Unknown block type %x.", Byte.valueOf(b2)));
        }
        readExecutionData();
        return true;
    }

    public void setExecutionDataVisitor(IExecutionDataVisitor iExecutionDataVisitor) {
        this.executionDataVisitor = iExecutionDataVisitor;
    }

    public void setSessionInfoVisitor(ISessionInfoVisitor iSessionInfoVisitor) {
        this.sessionInfoVisitor = iSessionInfoVisitor;
    }
}
