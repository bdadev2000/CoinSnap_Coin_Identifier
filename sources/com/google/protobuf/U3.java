package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class U3 extends D2 implements V3 {
    public /* synthetic */ U3(T3 t32) {
        this();
    }

    public U3 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((Method) this.instance).addAllOptions(iterable);
        return this;
    }

    public U3 addOptions(Option option) {
        copyOnWrite();
        ((Method) this.instance).addOptions(option);
        return this;
    }

    public U3 clearName() {
        copyOnWrite();
        ((Method) this.instance).clearName();
        return this;
    }

    public U3 clearOptions() {
        copyOnWrite();
        ((Method) this.instance).clearOptions();
        return this;
    }

    public U3 clearRequestStreaming() {
        copyOnWrite();
        ((Method) this.instance).clearRequestStreaming();
        return this;
    }

    public U3 clearRequestTypeUrl() {
        copyOnWrite();
        ((Method) this.instance).clearRequestTypeUrl();
        return this;
    }

    public U3 clearResponseStreaming() {
        copyOnWrite();
        ((Method) this.instance).clearResponseStreaming();
        return this;
    }

    public U3 clearResponseTypeUrl() {
        copyOnWrite();
        ((Method) this.instance).clearResponseTypeUrl();
        return this;
    }

    public U3 clearSyntax() {
        copyOnWrite();
        ((Method) this.instance).clearSyntax();
        return this;
    }

    @Override // com.google.protobuf.V3
    public String getName() {
        return ((Method) this.instance).getName();
    }

    @Override // com.google.protobuf.V3
    public H getNameBytes() {
        return ((Method) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.V3
    public Option getOptions(int i9) {
        return ((Method) this.instance).getOptions(i9);
    }

    @Override // com.google.protobuf.V3
    public int getOptionsCount() {
        return ((Method) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.V3
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Method) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.V3
    public boolean getRequestStreaming() {
        return ((Method) this.instance).getRequestStreaming();
    }

    @Override // com.google.protobuf.V3
    public String getRequestTypeUrl() {
        return ((Method) this.instance).getRequestTypeUrl();
    }

    @Override // com.google.protobuf.V3
    public H getRequestTypeUrlBytes() {
        return ((Method) this.instance).getRequestTypeUrlBytes();
    }

    @Override // com.google.protobuf.V3
    public boolean getResponseStreaming() {
        return ((Method) this.instance).getResponseStreaming();
    }

    @Override // com.google.protobuf.V3
    public String getResponseTypeUrl() {
        return ((Method) this.instance).getResponseTypeUrl();
    }

    @Override // com.google.protobuf.V3
    public H getResponseTypeUrlBytes() {
        return ((Method) this.instance).getResponseTypeUrlBytes();
    }

    @Override // com.google.protobuf.V3
    public Z4 getSyntax() {
        return ((Method) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.V3
    public int getSyntaxValue() {
        return ((Method) this.instance).getSyntaxValue();
    }

    public U3 removeOptions(int i9) {
        copyOnWrite();
        ((Method) this.instance).removeOptions(i9);
        return this;
    }

    public U3 setName(String str) {
        copyOnWrite();
        ((Method) this.instance).setName(str);
        return this;
    }

    public U3 setNameBytes(H h6) {
        copyOnWrite();
        ((Method) this.instance).setNameBytes(h6);
        return this;
    }

    public U3 setOptions(int i9, Option option) {
        copyOnWrite();
        ((Method) this.instance).setOptions(i9, option);
        return this;
    }

    public U3 setRequestStreaming(boolean z8) {
        copyOnWrite();
        ((Method) this.instance).setRequestStreaming(z8);
        return this;
    }

    public U3 setRequestTypeUrl(String str) {
        copyOnWrite();
        ((Method) this.instance).setRequestTypeUrl(str);
        return this;
    }

    public U3 setRequestTypeUrlBytes(H h6) {
        copyOnWrite();
        ((Method) this.instance).setRequestTypeUrlBytes(h6);
        return this;
    }

    public U3 setResponseStreaming(boolean z8) {
        copyOnWrite();
        ((Method) this.instance).setResponseStreaming(z8);
        return this;
    }

    public U3 setResponseTypeUrl(String str) {
        copyOnWrite();
        ((Method) this.instance).setResponseTypeUrl(str);
        return this;
    }

    public U3 setResponseTypeUrlBytes(H h6) {
        copyOnWrite();
        ((Method) this.instance).setResponseTypeUrlBytes(h6);
        return this;
    }

    public U3 setSyntax(Z4 z42) {
        copyOnWrite();
        ((Method) this.instance).setSyntax(z42);
        return this;
    }

    public U3 setSyntaxValue(int i9) {
        copyOnWrite();
        ((Method) this.instance).setSyntaxValue(i9);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private U3() {
        /*
            r1 = this;
            com.google.protobuf.Method r0 = com.google.protobuf.Method.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.U3.<init>():void");
    }

    public U3 addOptions(int i9, Option option) {
        copyOnWrite();
        ((Method) this.instance).addOptions(i9, option);
        return this;
    }

    public U3 setOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        ((Method) this.instance).setOptions(i9, (Option) c1934j4.build());
        return this;
    }

    public U3 addOptions(C1934j4 c1934j4) {
        copyOnWrite();
        ((Method) this.instance).addOptions((Option) c1934j4.build());
        return this;
    }

    public U3 addOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        ((Method) this.instance).addOptions(i9, (Option) c1934j4.build());
        return this;
    }
}
