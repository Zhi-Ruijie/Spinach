package name.spinach;

import name.spinach.datagen.ModLootTablesProvider;
import name.spinach.datagen.ModModelsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SpinachDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModLootTablesProvider::new);
	}
}
