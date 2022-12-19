package dev.jorel.commandapi.executors;

import dev.jorel.commandapi.commandsenders.BukkitCommandSender;
import dev.jorel.commandapi.exceptions.WrapperCommandSyntaxException;
import org.bukkit.command.CommandSender;

@FunctionalInterface
public interface ResultingCommandExecutionInfo extends IExecutorResulting<CommandSender, BukkitCommandSender<? extends CommandSender>> {

	/**
	 * The code to run when this command is performed
	 *
	 * @param info The AbstractExecutionInfo for this command
	 * @return the result of this command
	 * @throws WrapperCommandSyntaxException
	 */
	int run(AbstractExecutionInfo<CommandSender, BukkitCommandSender<? extends CommandSender>> info) throws WrapperCommandSyntaxException;

	/**
	 * Returns the type of the sender of the current executor.
	 * @return the type of the sender of the current executor
	 */
	@Override
	default ExecutorType getType() {
		return ExecutorType.ALL;
	}
}
