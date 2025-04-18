package org.objectweb.asm;

/* loaded from: classes4.dex */
final class CurrentFrame extends Frame {
    public CurrentFrame(Label label) {
        super(label);
    }

    @Override // org.objectweb.asm.Frame
    public void execute(int i2, int i3, Symbol symbol, SymbolTable symbolTable) {
        super.execute(i2, i3, symbol, symbolTable);
        Frame frame = new Frame(null);
        merge(symbolTable, frame, 0);
        copyFrom(frame);
    }
}
