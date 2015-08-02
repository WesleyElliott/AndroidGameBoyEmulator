/*
 * Copyright (C) 2015 Pedro Vicente Gomez Sanchez.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.github.pedrovgs.androidgameboyemulator.core.processor.isa;

import com.github.pedrovgs.androidgameboyemulator.core.mmu.MMU;
import com.github.pedrovgs.androidgameboyemulator.core.processor.GBZ80;
import com.github.pedrovgs.androidgameboyemulator.core.processor.Register;

public class InstructionsPool {

  private final Instruction[] normalInstructions;
  private final Instruction[] extendedInstructions;

  public InstructionsPool(GBZ80 z80, MMU mmu) {
    normalInstructions = new Instruction[256];
    extendedInstructions = new Instruction[256];
    generateNormalInstructions(z80, mmu);
    generateExtendedInstructions(z80, mmu);
  }

  public Instruction get(int rawInstruction) {
    return null;
  }

  private void generateNormalInstructions(GBZ80 z80, MMU mmu) {

  }

  private void generateExtendedInstructions(GBZ80 z80, MMU mmu) {
    normalInstructions[0x06] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.B);
    normalInstructions[0x0E] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.C);
    normalInstructions[0x16] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.D);
    normalInstructions[0x1E] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.E);
    normalInstructions[0x26] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.H);
    normalInstructions[0x2E] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.L);
    normalInstructions[0x7F] = new Load8BitRegisterInto8BitRegister(z80, Register.A, Register.A);
    normalInstructions[0x78] = new Load8BitRegisterInto8BitRegister(z80, Register.A, Register.B);
    normalInstructions[0x79] = new Load8BitRegisterInto8BitRegister(z80, Register.A, Register.C);
    normalInstructions[0x7A] = new Load8BitRegisterInto8BitRegister(z80, Register.A, Register.D);
    normalInstructions[0x7B] = new Load8BitRegisterInto8BitRegister(z80, Register.A, Register.E);
    normalInstructions[0x7C] = new Load8BitRegisterInto8BitRegister(z80, Register.A, Register.H);
    normalInstructions[0x7D] = new Load8BitRegisterInto8BitRegister(z80, Register.A, Register.L);
    normalInstructions[0x7E] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.A);
    normalInstructions[0x40] = new Load8BitRegisterInto8BitRegister(z80, Register.B, Register.B);
    normalInstructions[0x41] = new Load8BitRegisterInto8BitRegister(z80, Register.B, Register.C);
    normalInstructions[0x42] = new Load8BitRegisterInto8BitRegister(z80, Register.B, Register.D);
    normalInstructions[0x43] = new Load8BitRegisterInto8BitRegister(z80, Register.B, Register.E);
    normalInstructions[0x44] = new Load8BitRegisterInto8BitRegister(z80, Register.B, Register.H);
    normalInstructions[0x45] = new Load8BitRegisterInto8BitRegister(z80, Register.B, Register.L);
    normalInstructions[0x46] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.B);
    normalInstructions[0x48] = new Load8BitRegisterInto8BitRegister(z80, Register.C, Register.B);
    normalInstructions[0x49] = new Load8BitRegisterInto8BitRegister(z80, Register.C, Register.C);
    normalInstructions[0x4A] = new Load8BitRegisterInto8BitRegister(z80, Register.C, Register.D);
    normalInstructions[0x4B] = new Load8BitRegisterInto8BitRegister(z80, Register.C, Register.E);
    normalInstructions[0x4C] = new Load8BitRegisterInto8BitRegister(z80, Register.C, Register.H);
    normalInstructions[0x4D] = new Load8BitRegisterInto8BitRegister(z80, Register.C, Register.L);
    normalInstructions[0x4E] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.C);
    normalInstructions[0x50] = new Load8BitRegisterInto8BitRegister(z80, Register.D, Register.B);
    normalInstructions[0x51] = new Load8BitRegisterInto8BitRegister(z80, Register.D, Register.C);
    normalInstructions[0x52] = new Load8BitRegisterInto8BitRegister(z80, Register.D, Register.D);
    normalInstructions[0x53] = new Load8BitRegisterInto8BitRegister(z80, Register.D, Register.E);
    normalInstructions[0x54] = new Load8BitRegisterInto8BitRegister(z80, Register.D, Register.H);
    normalInstructions[0x55] = new Load8BitRegisterInto8BitRegister(z80, Register.D, Register.L);
    normalInstructions[0x56] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.D);
    normalInstructions[0x58] = new Load8BitRegisterInto8BitRegister(z80, Register.E, Register.B);
    normalInstructions[0x59] = new Load8BitRegisterInto8BitRegister(z80, Register.E, Register.C);
    normalInstructions[0x5A] = new Load8BitRegisterInto8BitRegister(z80, Register.E, Register.E);
    normalInstructions[0x5B] = new Load8BitRegisterInto8BitRegister(z80, Register.E, Register.E);
    normalInstructions[0x5C] = new Load8BitRegisterInto8BitRegister(z80, Register.E, Register.H);
    normalInstructions[0x5D] = new Load8BitRegisterInto8BitRegister(z80, Register.E, Register.L);
    normalInstructions[0x5E] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.E);
    normalInstructions[0x60] = new Load8BitRegisterInto8BitRegister(z80, Register.H, Register.B);
    normalInstructions[0x61] = new Load8BitRegisterInto8BitRegister(z80, Register.H, Register.C);
    normalInstructions[0x62] = new Load8BitRegisterInto8BitRegister(z80, Register.H, Register.D);
    normalInstructions[0x63] = new Load8BitRegisterInto8BitRegister(z80, Register.H, Register.E);
    normalInstructions[0x64] = new Load8BitRegisterInto8BitRegister(z80, Register.H, Register.H);
    normalInstructions[0x65] = new Load8BitRegisterInto8BitRegister(z80, Register.H, Register.L);
    normalInstructions[0x66] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.H);
    normalInstructions[0x68] = new Load8BitRegisterInto8BitRegister(z80, Register.L, Register.B);
    normalInstructions[0x69] = new Load8BitRegisterInto8BitRegister(z80, Register.L, Register.C);
    normalInstructions[0x6A] = new Load8BitRegisterInto8BitRegister(z80, Register.L, Register.D);
    normalInstructions[0x6B] = new Load8BitRegisterInto8BitRegister(z80, Register.L, Register.E);
    normalInstructions[0x6C] = new Load8BitRegisterInto8BitRegister(z80, Register.L, Register.H);
    normalInstructions[0x6D] = new Load8BitRegisterInto8BitRegister(z80, Register.L, Register.L);
    normalInstructions[0x6E] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.L);
    normalInstructions[0x70] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.B);
    normalInstructions[0x71] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.C);
    normalInstructions[0x72] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.D);
    normalInstructions[0x73] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.E);
    normalInstructions[0x74] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.H);
    normalInstructions[0x75] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.L);
    normalInstructions[0x36] = new Load8BitImmIntoHLAddress(z80, mmu);
    normalInstructions[0x0A] = new Load8BitBCAddressIntoA(z80, mmu);
    normalInstructions[0x1A] = new Load8BitDEAddressIntoA(z80, mmu);
    normalInstructions[0x7E] = new Load8BitHLAddressInto8BitRegister(z80, mmu, Register.A);
    normalInstructions[0xFA] = new Load16BitImmPCIntoA(z80, mmu);
    normalInstructions[0x3E] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.A);
    normalInstructions[0x47] = new Load8BitRegisterInto8BitRegister(z80, Register.B, Register.A);
    normalInstructions[0x4F] = new Load8BitRegisterInto8BitRegister(z80, Register.C, Register.A);
    normalInstructions[0x57] = new Load8BitRegisterInto8BitRegister(z80, Register.D, Register.A);
    normalInstructions[0x5F] = new Load8BitRegisterInto8BitRegister(z80, Register.E, Register.A);
    normalInstructions[0x67] = new Load8BitRegisterInto8BitRegister(z80, Register.H, Register.A);
    normalInstructions[0x6F] = new Load8BitRegisterInto8BitRegister(z80, Register.L, Register.A);
    normalInstructions[0x02] = new Load8BitRegisterAIntoBCAddress(z80, mmu);
    normalInstructions[0x12] = new Load8BitRegisterAIntoDEAddress(z80, mmu);
    normalInstructions[0x77] = new Load8BitRegisterAIntoHLAddress(z80, mmu);
    normalInstructions[0xEA] = new Load8BitRegisterAIntoTheImmPCAddress(z80, mmu);
    normalInstructions[0xF2] = new Load8BitPortRegisterOfCAddressIntoA(z80, mmu);
    normalInstructions[0xE2] = new Load8BitRegisterAIntoAddressPortRegisterOfC(z80, mmu);
    normalInstructions[0x3A] = new LoadHLAddressIntoAAndDecrementHL(z80, mmu);
    normalInstructions[0x32] = new Load8BitRegisterAIntoHLAddressAndDecrementHL(z80, mmu);
    normalInstructions[0x2A] = new LoadHLAddressIntoAAndIncrementHL(z80, mmu);
    normalInstructions[0x22] = new Load8BitRegisterAIntoHLAddressAndIncrementHL(z80, mmu);
    normalInstructions[0xE0] = new Load8BitRegisterAIntoAddressPortRegisterOfC(z80, mmu);
    normalInstructions[0xF0] = new Load8BitPortRegisterOfCAddressIntoA(z80, mmu);
    normalInstructions[0x01] = new Load16BitImmPcInto16BitRegister(z80, mmu, Register.BC);
    normalInstructions[0x11] = new Load16BitImmPcInto16BitRegister(z80, mmu, Register.DE);
    normalInstructions[0x21] = new Load16BitImmPcInto16BitRegister(z80, mmu, Register.HL);
    normalInstructions[0x31] = new Load16BitImmPcIntoStackPointer(z80, mmu);
    normalInstructions[0xF9] = new Load16BitRegisterHLIntoSP(z80);
    normalInstructions[0xF8] = new Load8BitImmPCPlusSPIntoHL(z80, mmu);
    normalInstructions[0x08] = new Load16BitImmPcIntoStackPointer(z80, mmu);
    normalInstructions[0xF5] = new Push16BitRegister(z80, mmu, Register.AF);
    normalInstructions[0xC5] = new Push16BitRegister(z80, mmu, Register.BC);
    normalInstructions[0xD5] = new Push16BitRegister(z80, mmu, Register.DE);
    normalInstructions[0xE5] = new Push16BitRegister(z80, mmu, Register.HL);
    normalInstructions[0xF1] = new Pop16BitRegister(z80, mmu, Register.AF);
    normalInstructions[0xC1] = new Pop16BitRegister(z80, mmu, Register.BC);
    normalInstructions[0xD1] = new Pop16BitRegister(z80, mmu, Register.DE);
    normalInstructions[0xE1] = new Pop16BitRegister(z80, mmu, Register.HL);
    normalInstructions[0x87] = new Add8BitRegisterPlusAIntoA(z80, Register.A);
    normalInstructions[0x80] = new Add8BitRegisterPlusAIntoA(z80, Register.B);
    normalInstructions[0x81] = new Add8BitRegisterPlusAIntoA(z80, Register.C);
    normalInstructions[0x82] = new Add8BitRegisterPlusAIntoA(z80, Register.D);
    normalInstructions[0x83] = new Add8BitRegisterPlusAIntoA(z80, Register.E);
    normalInstructions[0x84] = new Add8BitRegisterPlusAIntoA(z80, Register.H);
    normalInstructions[0x85] = new Add8BitRegisterPlusAIntoA(z80, Register.L);
    normalInstructions[0x86] = new Add8BitAddressHLPlusAIntoA(z80, mmu);
    normalInstructions[0xC6] = new Add8BitImmPCPlusAIntoA(z80, mmu);
    normalInstructions[0x8F] = new Adc8BitRegisterPlusAIntoA(z80, Register.A);
    normalInstructions[0x88] = new Adc8BitRegisterPlusAIntoA(z80, Register.B);
    normalInstructions[0x89] = new Adc8BitRegisterPlusAIntoA(z80, Register.C);
    normalInstructions[0x8A] = new Adc8BitRegisterPlusAIntoA(z80, Register.D);
    normalInstructions[0x8B] = new Adc8BitRegisterPlusAIntoA(z80, Register.E);
    normalInstructions[0x8C] = new Adc8BitRegisterPlusAIntoA(z80, Register.H);
    normalInstructions[0x8D] = new Adc8BitRegisterPlusAIntoA(z80, Register.L);
    normalInstructions[0x8E] = new Adc8BitHLAddressPlusAIntoA(z80, mmu);
    normalInstructions[0xCE] = new Adc8BitImmPCPlusAIntoA(z80, mmu);
    normalInstructions[0x97] = new Sub8BitRegisterToAIntoA(z80, Register.A);
    normalInstructions[0x90] = new Sub8BitRegisterToAIntoA(z80, Register.B);
    normalInstructions[0x91] = new Sub8BitRegisterToAIntoA(z80, Register.C);
    normalInstructions[0x92] = new Sub8BitRegisterToAIntoA(z80, Register.D);
    normalInstructions[0x93] = new Sub8BitRegisterToAIntoA(z80, Register.E);
    normalInstructions[0x94] = new Sub8BitRegisterToAIntoA(z80, Register.H);
    normalInstructions[0x95] = new Sub8BitRegisterToAIntoA(z80, Register.L);
    normalInstructions[0x96] = new Sub8BitAddressHLToAIntoA(z80, mmu);
    normalInstructions[0xD6] = new Sub8BitImmPCToAIntoA(z80, mmu);
    normalInstructions[0x9F] = new Sbc8BitRegisterToAIntoA(z80, Register.A);
    normalInstructions[0x98] = new Sbc8BitRegisterToAIntoA(z80, Register.B);
    normalInstructions[0x99] = new Sbc8BitRegisterToAIntoA(z80, Register.C);
    normalInstructions[0x9A] = new Sbc8BitRegisterToAIntoA(z80, Register.D);
    normalInstructions[0x9B] = new Sbc8BitRegisterToAIntoA(z80, Register.E);
    normalInstructions[0x9C] = new Sbc8BitRegisterToAIntoA(z80, Register.H);
    normalInstructions[0x9D] = new Sbc8BitRegisterToAIntoA(z80, Register.L);
    normalInstructions[0x9E] = new Sbc8BitAddressHLToAIntoA(z80, mmu);
    normalInstructions[0xDE] = new Sbc8BitImmPCToAIntoA(z80, mmu);
    normalInstructions[0xA7] = new And8BitRegisterToAIntoA(z80, Register.A);
    normalInstructions[0xA0] = new And8BitRegisterToAIntoA(z80, Register.B);
    normalInstructions[0xA1] = new And8BitRegisterToAIntoA(z80, Register.C);
    normalInstructions[0xA2] = new And8BitRegisterToAIntoA(z80, Register.D);
    normalInstructions[0xA3] = new And8BitRegisterToAIntoA(z80, Register.E);
    normalInstructions[0xA4] = new And8BitRegisterToAIntoA(z80, Register.H);
    normalInstructions[0xA5] = new And8BitRegisterToAIntoA(z80, Register.L);
    normalInstructions[0xA6] = new And8BitHLAddressToAIntoA(z80, mmu);
    normalInstructions[0xE6] = new And8BitImmPCToAIntoA(z80, mmu);
    normalInstructions[0xB7] = new Or8BitRegisterToAIntoA(z80, Register.A);
    normalInstructions[0xB0] = new Or8BitRegisterToAIntoA(z80, Register.B);
    normalInstructions[0xB1] = new Or8BitRegisterToAIntoA(z80, Register.C);
    normalInstructions[0xB2] = new Or8BitRegisterToAIntoA(z80, Register.D);
    normalInstructions[0xB3] = new Or8BitRegisterToAIntoA(z80, Register.E);
    normalInstructions[0xB4] = new Or8BitRegisterToAIntoA(z80, Register.H);
    normalInstructions[0xB5] = new Or8BitRegisterToAIntoA(z80, Register.L);
    normalInstructions[0xB6] = new Or8BitHLAddressToAIntoA(z80, mmu);
    normalInstructions[0xF6] = new Or8BitImmPCToAIntoA(z80, mmu);
    normalInstructions[0xAF] = new Xor8BitRegisterToAIntoA(z80, Register.A);
    normalInstructions[0xA8] = new Xor8BitRegisterToAIntoA(z80, Register.B);
    normalInstructions[0xA9] = new Xor8BitRegisterToAIntoA(z80, Register.C);
    normalInstructions[0xAA] = new Xor8BitRegisterToAIntoA(z80, Register.D);
    normalInstructions[0xAB] = new Xor8BitRegisterToAIntoA(z80, Register.E);
    normalInstructions[0xAC] = new Xor8BitRegisterToAIntoA(z80, Register.H);
    normalInstructions[0xAD] = new Xor8BitRegisterToAIntoA(z80, Register.L);
    normalInstructions[0xAE] = new Xor8BitHLAddressToAIntoA(z80, mmu);
    normalInstructions[0xEE] = new Xor8BitImmPCToAIntoA(z80, mmu);
    normalInstructions[0xBF] = new Cp8BitRegisterWithA(z80, Register.A);
    normalInstructions[0xB8] = new Cp8BitRegisterWithA(z80, Register.B);
    normalInstructions[0xB9] = new Cp8BitRegisterWithA(z80, Register.C);
    normalInstructions[0xBA] = new Cp8BitRegisterWithA(z80, Register.D);
    normalInstructions[0xBB] = new Cp8BitRegisterWithA(z80, Register.E);
    normalInstructions[0xBC] = new Cp8BitRegisterWithA(z80, Register.H);
    normalInstructions[0xBD] = new Cp8BitRegisterWithA(z80, Register.L);
    normalInstructions[0xBE] = new Cp8BitHLAddressWithA(z80, mmu);
    normalInstructions[0xFE] = new Cp8BitImmPCWithA(z80, mmu);
    normalInstructions[0x3C] = new Inc8BitRegister(z80, Register.A);
    normalInstructions[0x04] = new Inc8BitRegister(z80, Register.B);
    normalInstructions[0x0C] = new Inc8BitRegister(z80, Register.C);
    normalInstructions[0x14] = new Inc8BitRegister(z80, Register.D);
    normalInstructions[0x1C] = new Inc8BitRegister(z80, Register.E);
    normalInstructions[0x24] = new Inc8BitRegister(z80, Register.H);
    normalInstructions[0x2C] = new Inc8BitRegister(z80, Register.L);
    normalInstructions[0x34] = new IncHLAddress(z80, mmu);
    normalInstructions[0x3D] = new Dec8BitRegister(z80, Register.A);
    normalInstructions[0x05] = new Dec8BitRegister(z80, Register.B);
    normalInstructions[0x0D] = new Dec8BitRegister(z80, Register.C);
    normalInstructions[0x15] = new Dec8BitRegister(z80, Register.D);
    normalInstructions[0x1D] = new Dec8BitRegister(z80, Register.E);
    normalInstructions[0x25] = new Dec8BitRegister(z80, Register.L);
    normalInstructions[0x2D] = new Dec8BitRegister(z80, Register.L);
    normalInstructions[0x35] = new DecHLAddress(z80, mmu);
    normalInstructions[0x09] = new Add16BitRegisterToHLIntoHL(z80, Register.BC);
    normalInstructions[0x19] = new Add16BitRegisterToHLIntoHL(z80, Register.DE);
    normalInstructions[0x29] = new Add16BitRegisterToHLIntoHL(z80, Register.HL);
    normalInstructions[0x39] = new Add16BitStackPointerToHLIntoHL(z80);
    normalInstructions[0xE8] = new Add16BitRegisterSPPlus8BitImmPCIntoSP(z80, mmu);
  }
}
